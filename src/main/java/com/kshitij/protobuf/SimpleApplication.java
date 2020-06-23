package com.kshitij.protobuf;


import simple.example.Simple.SimpleMessage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleApplication {
    public static void main(String[] args) {
        System.out.println("Hello Message");
        SimpleMessage.Builder messageBuilder= SimpleMessage.newBuilder();
        messageBuilder.setId(2)
                .setName("Some Name")
                .setIsSimple(Boolean.FALSE)
                .addSample(1)
                .addSample(2);
        SimpleMessage message=messageBuilder.build();
        System.out.println("The message start "+message);
        try {
            FileOutputStream fos= new FileOutputStream("protofile.bin");
            fos.write(message.toByteArray());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
