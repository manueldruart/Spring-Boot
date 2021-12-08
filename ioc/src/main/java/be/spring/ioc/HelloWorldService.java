package be.spring.ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    void sayHello() {
        System.out.println("Hello World !");
    }
}
