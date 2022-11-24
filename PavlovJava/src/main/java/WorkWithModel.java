import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

public class WorkWithModel {
    private QAServiceGrpc.QAServiceBlockingStub stub;
    private ManagedChannel channel;

    public WorkWithModel(){
         channel= ManagedChannelBuilder.forTarget("localhost:50051").usePlaintext().build();
         stub = QAServiceGrpc.newBlockingStub(channel);
    }

    public String askQuestion(String text,String question){
        QA.QARequest request=QA.QARequest.newBuilder()
                .setText(text)
                .setQuestion(question)
                .build();

        QA.QAResponse response= stub.ask(request);

        return response.getAnswer();
    }




}

