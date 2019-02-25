package ru.milandr.courses.demo1;

import org.springframework.stereotype.Component;

@Component
public class SergeyApp {

    private Man sergey;

    public SergeyApp(Man sergey) {
        this.sergey = sergey;
    }

    public void doSmth() {
        sergey.sayHello();
        sergey.sayGoodbye();
    }
}
