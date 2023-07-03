package com.github.simplesteph.grpc.greeting.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        //Extract fields
        Greeting greeting = request.getGreeting();
        String first_name = greeting.getFirstName();
        //Create the response
        String result = "Hello " + first_name;
        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        //Send the response
        responseObserver.onNext(response);

        //Complete the rpc call
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTime(GreetManyTimeRequest request, StreamObserver<GreetManyTimeResponse> responseObserver) {
        String firstName = request.getGreeting().getFirstName();
        try {
            for(int i = 0; i < 10; i++) {
                String result = "Hello " + firstName + ", response number: " + i;
                GreetManyTimeResponse response = GreetManyTimeResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            responseObserver.onCompleted();
        }
    }
}
