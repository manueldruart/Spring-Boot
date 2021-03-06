package be.spring.ioc.Exercice1ApplicationContext;


import be.spring.ioc.IocApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private BookShelf bookShelf;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(IocApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("adresse du pointer dans main" + bookShelf);
        bookShelf.importAndReadOrder();
    }
}

