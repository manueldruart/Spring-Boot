package be.spring.BeanFactory;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookShelf {


   /* private IBookImporter iBookImporter;

    @Autowired
    public BookShelf(IBookImporter iBookImporter) {
        this.iBookImporter = iBookImporter;
    }

    public BookShelf() {

    }

    void importAndRead () {
        iBookImporter.importer();
    }*/


    private List<IBookImporter> importers;

    public BookShelf(List<IBookImporter> importers) {
        this.importers = importers;
    }

    void importAndRead() {
        importers.forEach(IBookImporter::importer);
    }
}

