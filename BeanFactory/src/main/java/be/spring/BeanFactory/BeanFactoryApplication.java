package be.spring.BeanFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanFactoryApplication implements CommandLineRunner {

	@Autowired
	private BookShelf bookShelf;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BeanFactoryApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Override

	public void run(String... args) throws Exception {
		bookShelf.importAndRead();
	}

}
