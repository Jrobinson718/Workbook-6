package com.pluralsight;

public class House extends FixedAsset{

    private int yearBuilt;
    private int squareFt;
    private int bedrooms;

    public House(int yearBuilt, int squareFt, int bedrooms) {
        super("House", 0);
        this.yearBuilt = yearBuilt;
        this.squareFt = squareFt;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return squareFt * 2000;
    }
}
