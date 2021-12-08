package be.spring.BeanFactory;

import org.springframework.beans.factory.annotation.Autowired;

public class BookShelf {


    private IBookImporter iBookImporter;

    @Autowired
    public BookShelf(IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
    }

    public BookShelf() {

    }

    void importAndRead () {
        iBookImporter.importer();
    }
}

