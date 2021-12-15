package be.technocite.ecarfinal.user.modele;

import be.technocite.ecarfinal.car.modele.Car;

import java.util.List;

public class UserDto {
    private int id;
    private String firstName;
    private List<Car> favoriteCars;

    public UserDto(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public UserDto(int id, String firstName, List<Car> favoriteCars) {
        this.id = id;
        this.firstName = firstName;
        this.favoriteCars = favoriteCars;
    }

    public UserDto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Car> getFavoriteCars() {
        return favoriteCars;
    }

    public void setFavoriteCars(List<Car> favoriteCars) {
        this.favoriteCars = favoriteCars;
    }
}
