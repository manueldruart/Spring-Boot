package be.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocApplication implements CommandLineRunner {

    @Autowired
    private HelloWorldService helloWorldService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(IocApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        helloWorldService.sayHello();
    }
}


