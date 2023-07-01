package com.github.simplesteph.grpc.member.server;

import com.github.simplesteph.grpc.greeting.calculator.server.CalculatorServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MemberServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello gRPC");
        Server server = ServerBuilder.forPort(50052)
                .addService(new MemberServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
