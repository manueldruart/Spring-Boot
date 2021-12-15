package be.technocite.ecarfinal.car.modele;

import java.util.Date;
import java.util.Objects;

public class Car {
    private static int idIndex;
    private int id;
    private String brand;
    private double buyingPrice;
    private double marketPrice;
    private String vin;
    private Date year;


    public Car(String brand, double originalPrice, double marketPrice, String vin, Date year) {
        idIndex++;
        this.id = idIndex;
        this.brand = brand;
        this.buyingPrice = originalPrice;
        this.marketPrice = marketPrice;
        this.vin = vin;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Double.compare(car.buyingPrice, buyingPrice) == 0 && brand.equals(car.brand) && vin.equals(car.vin) && year.equals(car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, buyingPrice, marketPrice, vin, year);
    }
}
