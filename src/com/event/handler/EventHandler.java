package com.event.handler;

import com.encapsulation.FileStore;
import com.message.IEvent;

public class EventHandler {
    IEvent event;
    FileStore scope;
    
    public EventHandler(FileStore scope, IEvent event) {
        this.event = event;
        this.scope = scope;
        this.event.printMessage();
    }
}