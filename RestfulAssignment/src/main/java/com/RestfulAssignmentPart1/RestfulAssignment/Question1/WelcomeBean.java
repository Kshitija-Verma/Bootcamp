package com.RestfulAssignmentPart1.RestfulAssignment.Question1;

public class WelcomeBean {
    private String message;
    WelcomeBean(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WelcomeBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
