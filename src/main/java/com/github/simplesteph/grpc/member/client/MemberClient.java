package com.github.simplesteph.grpc.member.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import member.Member.MemberRequest;
import member.Member.MemberResponse;
import member.MemberServiceGrpc;

public class MemberClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        MemberServiceGrpc.MemberServiceBlockingStub stub = MemberServiceGrpc.newBlockingStub(channel);

        MemberRequest request = MemberRequest.newBuilder()
                .setUsername("@chloé")
                .build();

        MemberResponse response = stub.get(request);

        System.out.println("Vous visitez le profil de " + request.getUsername() + " infos : " + response.getFirstName() + " " + response.getLastName());

        channel.shutdown();

    }
}
