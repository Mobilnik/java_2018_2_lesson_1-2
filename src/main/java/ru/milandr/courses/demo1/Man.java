package ru.milandr.courses.demo1;

import org.springframework.stereotype.Component;

@Component
public class Man {

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayGoodbye() {
        System.out.println("Bye-bye");
    }
}
