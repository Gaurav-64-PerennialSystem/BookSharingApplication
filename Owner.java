package com.company;

public class Owner {
    private String ownerName;
    private String emailId;
    public Owner(){}
    public Owner(String ownerName, String emailId) {
        this.ownerName = ownerName;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return " {ownerName='" + ownerName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
