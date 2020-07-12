package com.encapsulation;

import java.io.FileReader;
import java.io.IOException;

import com.event.handler.EventHandler;
import com.message.MessageEventArgs;

public class FileStore {
    private String workingDirectory;

    public FileStore(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public EventHandler getMessageRead() {
        return this.MessageRead;
    }

    public void setMessageRead(EventHandler MessageRead) {
        this.MessageRead = MessageRead;
    }

    // public String save(int id, String message) {
    //     String path = this.workingDirectory + id + ".txt";
    //     this.writeAllText(path, message);
    //     return path;
    // }

    public EventHandler MessageRead;

    public void read(int id) throws IOException {
        String path = this.workingDirectory + id + ".txt";
        String msg = this.readAllText(path);
        this.MessageRead = new EventHandler(this, new MessageEventArgs(msg));
    }

    private String readAllText(String path) throws IOException {
        FileReader in = new FileReader(path);
        String out = null;
        int text;
        while ((text = in.read()) != -1) {
            out += text;
        }
        in.close();
        return out;
    }

    // private void writeAllText(String path, String message){
    //     FileOutputStream out = new FileOutputStream()

    // }
}