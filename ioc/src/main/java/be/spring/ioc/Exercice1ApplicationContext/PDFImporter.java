package be.spring.ioc.Exercice1ApplicationContext;

import org.springframework.stereotype.Component;

@Component("PDFImporter")
public class PDFImporter implements IBookImporter {



    @Override
    public void importer() {
        System.out.println("Bean Imported by PDF");
    }
}
