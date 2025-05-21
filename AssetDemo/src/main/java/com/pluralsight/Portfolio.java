package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<Valuable>();
    }

    public void add(Valuable valuable)  {
        this.valuables.add(valuable);
    }

    public double getValue(){
        double total = 0;

        for (Valuable valuable : valuables) {
            total += valuable.getValue();
        }
        return total;
    }
}
