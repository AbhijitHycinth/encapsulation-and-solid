package com.encapsulation;

import com.event.handler.EventHandler;
import com.message.MessageEventArgs;

public class FileStore {
    private String workingDirectory;


    public String save(int id, String message){
        String path = Path.Combine(this.workingDirectory, id + ".txt");
        File.WriteAllText(path, message);
        return path;
    }

    public EventHandler MessageRead;

    public void Read(int id){
        String path = Path.Combine(this.workingDirectory, id + ".txt");
        String msg = File.ReadAllText(path);
        this.MessageRead = new EventHandler(this, new MessageEventArgs(msg));
    }

}