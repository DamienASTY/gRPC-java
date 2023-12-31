package com.github.simplesteph.grpc.greeting.calculator.server;

import com.proto.calculator.*;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {

        SumResponse sumResponse = SumResponse.newBuilder()
                .setSumResult(request.getFirstNumber() + request.getSecondNumber())
                .build();

        responseObserver.onNext(sumResponse);

        responseObserver.onCompleted();
    }

    @Override
    public void primeNumberDecomposition(PrimeNumberDecompositonRequest request, StreamObserver<PrimeNumberDecompositionResponse> responseObserver) {
        Integer number = request.getNumber();
        Integer divisor = 2;
        while (number > 1) {
            if (number % divisor == 0) {
                number = number/divisor;
                responseObserver.onNext(PrimeNumberDecompositionResponse.newBuilder()
                        .setPrimeFactor(number)
                        .build());
            } else {
                divisor = divisor+1;
            }
        }
        responseObserver.onCompleted();
    }
}
