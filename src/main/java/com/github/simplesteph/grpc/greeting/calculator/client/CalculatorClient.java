package com.github.simplesteph.grpc.greeting.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.PrimeNumberDecompositonRequest;
import com.proto.calculator.SumRequest;
import com.proto.calculator.SumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        //Unary
        /*
        SumRequest request = SumRequest.newBuilder()
                        .setFirstNumber(3)
                        .setSecondNumber(2)
                        .build();

        SumResponse response = stub.sum(request);
        System.out.println(request.getFirstNumber() + " + " + request.getSecondNumber() + " = " + response.getSumResult());
        */
        //Streaming Server
        Integer number = 567890;
        stub.primeNumberDecomposition(PrimeNumberDecompositonRequest.newBuilder()
                .setNumber(number).build())
                        .forEachRemaining(primeNumberDecompositionResponse -> {
                            System.out.println(primeNumberDecompositionResponse.getPrimeFactor());
                        });
        channel.shutdown();
    }
}
