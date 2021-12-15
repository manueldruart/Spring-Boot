package be.technocite.ecarfinal.carapi.dto;

import java.util.Date;

public class CarDtoBuyer {
    private static int idIndex;
    private int id;
    private String brand;
    private double marketPrice;
    private String vin;
    private Date year;

    public CarDtoBuyer(int id,
                       String brand,
                       double marketPrice,
                       String vin,
                       Date year) {
        this.id = id;
        this.brand = brand;
        this.marketPrice = marketPrice;
        this.vin = vin;
        this.year = year;
    }

    // Getter obligatoire pour sérialiser le java en json via la librairie Jackson
    public static int getIdIndex() {
        return idIndex;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public String getVin() {
        return vin;
    }

    public Date getYear() {
        return year;
    }
}
