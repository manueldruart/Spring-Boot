package be.spring.BeanFactory;

import org.springframework.stereotype.Component;


public class PDFBookImporter implements IBookImporter {
    @Override
    public void importer() {
        System.out.println("Bean Imported by PDF");
    }
}
