package be.spring.ioc.Exercice1ApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScopeTest {


    private  BookShelf bookShelf;

    @Autowired
    public ScopeTest(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        System.out.println("adresse du pointer du bean Bookshelf" + bookShelf);
    }
}
