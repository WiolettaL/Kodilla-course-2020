package com.kodilla.good.patterns.challenges.Allegro;

public class UserContactService implements InformationService {

    private String communicator;

    public UserContactService(String communicator) {
        this.communicator = communicator;
    }

    public String getCommunicator() {
        return communicator;
    }

    @Override
    public boolean inform(User user) {
        boolean infoPossibility;
        if (user != null && communicator == "phone") {
            System.out.println("Send SMS with confirmation to the User.");
            infoPossibility = true;
        } else if (user != null && communicator == "e-mail") {
            System.out.println("Send e-mail with confirmation to the User.");
            infoPossibility = true;
        } else {
            System.out.println("Contact method has not been selected! Please select correct contact method and try again!");
            infoPossibility = false;
        }
        return infoPossibility;
    }

    @Override
    public String toString() {
        return "UserContactService{" +
                "communicator='" + communicator + '\'' +
                '}';
    }
}
