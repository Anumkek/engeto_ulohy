package com.example;

import java.time.LocalDate;

public class Car {

    private String brand;
    private String make;
    private int seats;
    // private Integer seats;
    //private Boolean logickaHodnota;
    private String registrationNumber;
    private int power; // short, long, byte
    private LocalDate nextCheckDate;

    // encapsulation - zapouzdření
    // modifikátory přístupu
    // sin(x)

    public Car(String brand, String registrationNumber, LocalDate nextCheckDate) {
        this(brand, "", 5, registrationNumber, 0, nextCheckDate);
    }

    public Car(String brand, String make, int seats, String registrationNumber, int power, LocalDate nextCheckDate) {
        this.brand = brand;
        this.make = make;
        this.seats = seats;
        this.registrationNumber = registrationNumber;
        this.power = power;
        this.nextCheckDate = nextCheckDate;
    }

    public void setSeats(String numberAsText) {
        seats = Integer.parseInt(numberAsText);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public LocalDate getNextCheckDate() {
        return nextCheckDate;
    }

    /**
     * Pokud je nextCheckDate starší než dnešní datum, použijeme místo něj dnešní datum.
     * @param nextCheckDate
     */
    public void setNextCheckDate(LocalDate nextCheckDate) {
        if (nextCheckDate.isBefore(LocalDate.now())) {
            this.nextCheckDate = LocalDate.now();
        } else {
            this.nextCheckDate = nextCheckDate;
        }
    }
}