package com.kodilla.good.patterns.challenges.food2doorCompany;

public class InfoService {

    private String communicator;

    public InfoService(String communicator) {
        this.communicator = communicator;
    }

    public String getCommunicator() {
        return communicator;
    }

    public boolean inform(Producer producer) {
        boolean infoPossibility;
       if (producer != null) {
            System.out.println("Sending e-mail with confirmation to: " + producer.getProducerName());
            infoPossibility = true;
        } else {
            System.out.println("Something went wrong. E-mail with confirmation has not been send to producer...");
            infoPossibility = false;
        }
        return infoPossibility;
    }

    @Override
    public String toString() {
        return "InfoService{" +
                "communicator='" + communicator + '\'' +
                '}';
    }
}
