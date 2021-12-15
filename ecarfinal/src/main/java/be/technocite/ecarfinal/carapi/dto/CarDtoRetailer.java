package be.technocite.ecarfinal.carapi.dto;

import java.util.Date;

public class CarDtoRetailer {
    private static int idIndex;
    private int id;
    private String brand;
    private double buyingPrice;
    private double marketPrice;
    private String vin;
    private Date year;


    public CarDtoRetailer(int id, String brand, double buyingPrice, double marketPrice, String vin, Date year) {
        this.id = id;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.marketPrice = marketPrice;
        this.vin = vin;
        this.year = year;
    }

    public static int getIdIndex() {
        return idIndex;
    }

    public static void setIdIndex(int idIndex) {
        CarDtoRetailer.idIndex = idIndex;
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
}
