package com.github.simplesteph.grpc.member.server;

import io.grpc.stub.StreamObserver;
import member.Member;
import member.Member.MemberRequest;
import member.Member.MemberResponse;
import member.MemberServiceGrpc;

public class MemberServiceImpl extends MemberServiceGrpc.MemberServiceImplBase {

    @Override
    public void get(MemberRequest request, StreamObserver<MemberResponse> responseObserver) {
        //Doit renvoyer une série de valeur si le nom d'utilisateur est "@chloé"
        String username = request.getUsername();
        String fname = "";
        String lname = "";


        if(username != "@chloé") {
            fname = "Chloé";
            lname = "Dhaneus";
        } else {
            fname = "Madison";
            lname = "Beer";
        }

        MemberResponse response = MemberResponse.newBuilder()
                .setUsername(username)
                .setFirstName(fname)
                .setLastName(lname)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
