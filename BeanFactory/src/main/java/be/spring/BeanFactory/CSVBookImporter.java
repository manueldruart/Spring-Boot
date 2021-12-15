package be.spring.BeanFactory;

import org.springframework.stereotype.Component;


public class CSVBookImporter implements IBookImporter{


    @Override
    public void importer() {
        System.out.println("Bean Imported by CSV");
    }
}
