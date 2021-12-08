package be.spring.BeanFactory;

import be.spring.BeanFactory.BookShelf;
import be.spring.BeanFactory.IBookImporter;
import be.spring.BeanFactory.XMLBookImporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExerciceBeanFactory {

    @Bean
   public BookShelf bookShelf (IBookImporter bookImporter) {
        BookShelf bS = new BookShelf(bookImporter);
        return bS;
    }

    @Bean
    public XMLBookImporter xmlBookImporter(){
        XMLBookImporter bookImporter = new XMLBookImporter();
        return bookImporter;
    }
}
