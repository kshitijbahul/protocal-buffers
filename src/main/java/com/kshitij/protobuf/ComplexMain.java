package com.kshitij.protobuf;

import example.complex.Complex;

import java.util.Arrays;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("Complex Example");
        Complex.DummyMessage firstDummyMessage = createNewDummyMessage("name 1",110);
        Complex.ComplexMessage.Builder complexMessageBuilder = Complex.ComplexMessage.newBuilder();
        complexMessageBuilder.setOneDummy(firstDummyMessage);
        complexMessageBuilder.addMultipleDummy(createNewDummyMessage("name 2",110));
        complexMessageBuilder.addMultipleDummy(createNewDummyMessage("name 3",111));
        complexMessageBuilder.addMultipleDummy(createNewDummyMessage("name 4",112));
        complexMessageBuilder.addAllMultipleDummy(Arrays.asList(
                createNewDummyMessage("name 5",113),
                createNewDummyMessage("name 6",114)
        ));
        Complex.ComplexMessage complexMessage = complexMessageBuilder.build();
        System.out.println(complexMessage);
    }
    public static Complex.DummyMessage createNewDummyMessage(String name,int id){
        Complex.DummyMessage.Builder dummyMessageBuilder = Complex.DummyMessage.newBuilder();
        Complex.DummyMessage dummyMessage=dummyMessageBuilder.setId(id)
                .setName(name)
                .build();
        return dummyMessage;
    }
}
