package be.spring.ioc.Exercice1ApplicationContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
@Scope("singleton")
public class BookShelf {

    // Injection by properties

    /*@Qualifier("PDFImporter")*/
    private IBookImporter iBookImporter;
    @Autowired
    private List<IBookImporter> importers;
    @Value("${be.spring.maconfig}")
    private String maConfig;

    // Injection by constructor





     public BookShelf(@Qualifier("PDFImporter")IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
     }

    //Injection by setter

 /*     @Autowired
        @Qualifier("CSVImporter)
   public void setiBookImporter(IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
    }*/

/*
    void importAndRead() {

        iBookImporter.importer();
    }
*/

    void importAndReadOrder() {
        importers.forEach(IBookImporter::importer);
    }

    // @PreDestroy works only with a singleton
    @PreDestroy
    private void onDestroy() {
        System.err.println("bookshelf dead");
    }

    // @PostConstruct works with all
    @PostConstruct
    private void onPostConstruct() {
        System.err.println("bookshelf has been created");
        System.err.println(maConfig);
    }
}


