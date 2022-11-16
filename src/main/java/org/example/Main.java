package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.example" })
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        MyEventPublisher myEventPublisher = ctx.getBean(MyEventPublisher.class);
        myEventPublisher.publishEvent("testowa wiadomość");
        System.out.println("main idzie sobie dalej");

    }
}