package be.spring.BeanFactory;

public class XMLBookImporter implements IBookImporter {
    @Override
    public void importer() {
        System.out.println("Bean importé par XML");
    }
}
