package be.spring.ioc.Exercice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class BookShelf {

    // Injection by properties
    @Autowired
    private IBookImporter iBookImporter;

    // Injection by constructor

     /*@Autowired
     public BookShelf(IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
     }*/

     //Injection by setter

 /*     @Autowired
   public void setiBookImporter(IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
    }*/

    void importAndRead () {
        iBookImporter.importer();
    }
}
