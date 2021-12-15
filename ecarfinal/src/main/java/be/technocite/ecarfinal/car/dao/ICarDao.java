package be.technocite.ecarfinal.car.dao;

import be.technocite.ecarfinal.car.modele.Car;

import java.util.List;

// Ceci est une classe exemple, c'est ici qu'on crée les signatures methodes
// pour accéder à la couche persistence avec la base de données
public interface ICarDao {

    public Car findById(int id);

    public List<Car> findAll();

    Car save(Car save);

    boolean delete(int id);

    int count();


}
