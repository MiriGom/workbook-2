package com.pluralsight.customers;

public class customers {

    private int id;

    private String name;

    private float outstandingBalance;

    public customers(int id, String name, float outstandingBalance) {
        this.id = id;
        this.name = name;
        this.outstandingBalance = outstandingBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    @Override
    public String toString() {
        return "customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", outstandingBalance=" + outstandingBalance +
                '}';
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");

        customers me = new customers(1, "Dana W.", 125.00f);

        System.out.println(me.toString());
        System.out.println(me);
    }
}

