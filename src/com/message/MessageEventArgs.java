package com.message;

public class MessageEventArgs implements IEvent{

    private String message;

    public MessageEventArgs(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(this.message);
    }
}