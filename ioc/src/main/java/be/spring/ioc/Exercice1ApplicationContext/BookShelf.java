package be.spring.ioc.Exercice1ApplicationContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class BookShelf {

    // Injection by properties

    /*@Qualifier("PDFImporter")*/
    private IBookImporter iBookImporter;
    @Autowired
    private List<IBookImporter> importers;

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
}


