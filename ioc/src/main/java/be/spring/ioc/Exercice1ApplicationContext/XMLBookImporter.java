package be.spring.ioc.Exercice1ApplicationContext;

import org.springframework.stereotype.Component;

@Component("XMLImporter")
public class XMLBookImporter implements IBookImporter {

    @Override
    public void importer() {
        System.out.println("Bean importé par XML");
    }
}
