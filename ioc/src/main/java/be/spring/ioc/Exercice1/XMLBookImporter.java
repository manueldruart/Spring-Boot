package be.spring.ioc.Exercice1;

import org.springframework.stereotype.Component;

@Component
public class XMLBookImporter implements IBookImporter{

    @Override
    public void importer() {
        System.out.println("Bean importé par XML");
    }
}
