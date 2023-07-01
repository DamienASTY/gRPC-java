package com.github.simplesteph.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating stub");

        /*Old and dummy
        DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);
        DummyServiceGrpc.DummyServiceFutureStub asyncClient = DummyServiceGrpc.newFutureStub(channel);
        */

        //Created a greet service client (blocking - synchronous)
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);
        //Created a protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                        .setFirstName("Chloé")
                        .setLastName("Dhaneus")
                        .build();
        //do the same for a greet response
        GreetRequest greetRequest = GreetRequest.newBuilder()
                        .setGreeting(greeting)
                        .build();
        //Cal the RPC and get back a GreetResponse (protocol buffer)
        GreetResponse greetResponse = greetClient.greet(greetRequest);

        System.out.println(greetResponse.getResult());

        //Do something
        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
