package be.spring.ioc.Exercice1ApplicationContext;

import org.springframework.stereotype.Component;

@Component("CSVImporter")
public class CSVBookImporter implements IBookImporter{



    @Override
    public void importer() {
        System.out.println("Bean Imported by CSV");
    }
}
