package com.pluralsight;

public class Vehicle {

    private int id;
    private String makeModel;
    private int year;


    public Vehicle (int id, String makeModel, int year) {
        this.id = id;
        this.makeModel = makeModel;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", makeModel='" + makeModel + '\'' +
                ", year=" + year +
                '}';
    }
}
