package org.example;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @EventListener
    public void listenForEvent(MyEvent myEvent) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Thread.activeCount());
        System.out.println();
        Thread.sleep(1000);
        System.out.println("Przyszedł event z: " + myEvent.getSource() + ". Wiadomość: " + myEvent.getMessage());

    }
}
