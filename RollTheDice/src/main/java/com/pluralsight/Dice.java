package com.pluralsight;

public class Dice {
    int side1 = 1;
    int side2 = 2;
    int side3 = 3;
    int side4 = 4;
    int side5 = 5;
    int side6 = 6;
/*
    public Dice(int side1, int side2, int side3, int side4, int side5, int side6) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
    }*/

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getSide5() {
        return side5;
    }

    public void setSide5(int side5) {
        this.side5 = side5;
    }

    public int getSide4() {
        return side4;
    }

    public void setSide4(int side4) {
        this.side4 = side4;
    }

    public int getSide6() {
        return side6;
    }

    public void setSide6(int side6) {
        this.side6 = side6;
    }
    public int roll() {
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;
    }
}
