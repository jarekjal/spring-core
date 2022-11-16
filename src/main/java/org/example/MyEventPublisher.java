package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {

    @Autowired
    ApplicationEventPublisher publisher;

    public void publishEvent(String message){
        MyEvent event = new MyEvent(this, message);
        System.out.println("Wysyłam event. Wiadomość: " + message);
        publisher.publishEvent(event);
    }
}
