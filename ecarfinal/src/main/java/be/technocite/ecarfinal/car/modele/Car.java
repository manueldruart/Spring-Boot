package be.technocite.ecarfinal.car.modele;

import java.util.Date;

public class Car {
    private static int idIndex;
    private int id;
    private String brand;
    private double originalPrice;
    private double marketPrice;
    private String vin;
    private Date year;


    public Car(String brand, double originalPrice, double marketPrice, String vin, Date year) {
        idIndex++;
        this.id = idIndex;
        this.brand = brand;
        this.originalPrice = originalPrice;
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

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
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

}
