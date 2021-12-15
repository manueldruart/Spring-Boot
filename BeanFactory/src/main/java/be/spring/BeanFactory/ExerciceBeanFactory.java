package be.spring.BeanFactory;

import be.spring.BeanFactory.BookShelf;
import be.spring.BeanFactory.IBookImporter;
import be.spring.BeanFactory.XMLBookImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

@Configuration
public class ExerciceBeanFactory {

    /*@Bean
   public BookShelf bookShelf (@Qualifier("pdf") IBookImporter bookImporter) {
        BookShelf bS = new BookShelf(bookImporter);
        return bS;
    }*/

    @Bean
    public BookShelf bookShelf(@Autowired List<IBookImporter> importers) {
        BookShelf bS = new BookShelf(importers);
        return bS;
    }

    @Bean("xml")
    @Order(3)
    public XMLBookImporter xmlBookImporter(){
        XMLBookImporter bookImporter = new XMLBookImporter();
        return bookImporter;
    }

    @Bean("pdf")
    @Order(1)
    public IBookImporter PDFBookImporter() {
        IBookImporter bookImporter = new PDFBookImporter();
        return bookImporter;
    }

    @Bean("csv")
    @Order(2)
    public IBookImporter CSVBookImporter() {
        IBookImporter bookImporter = new CSVBookImporter();
        return bookImporter;
    }
}
