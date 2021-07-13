package ca.ciccc.wmad202.assignment6.problem;

import java.util.ArrayList;

public class Table {

    private ArrayList<Item> items;

    Table(){
        this.items = new ArrayList<>();
    }

    Table(ArrayList<Item> items){
        this.items = items;
    }


    // --- get total volume
    // --- get total volume for cuboid


    public double getTotalVolume(){
        double totalVolume = 0;
        for(Item item : items){
            totalVolume += item.getVolume(); // Polymorphism
        }
        return totalVolume;
    }

    public double getTotalVolumeForCuboid(){
        double totalVolume = 0;
        for(Item item : items){
            if(item instanceof Cuboid){
                totalVolume += item.getVolume(); // Polymorphism
            }
        }
        return totalVolume;
    }

    public double getTotalVolumeOfYellow(){
        double totalVolume = 0;
        for(Item item : items){
            if(item.getColor() == Item.Color.Yellow){
                totalVolume += item.getVolume(); // Polymorphism
            }
        }
        return totalVolume;
    }

    public double getTotalVolume(Class itemType){
        double totalVolume = 0;
        for(Item i : items){
            if(i.getClass().equals(itemType)){
                totalVolume += i.getVolume(); // Polymorphism
            }
        }
        return totalVolume;
    }

    public double getTotalVolume(Item.Color color){
        double totalVolume = 0;
        for(Item item : items){
            if(item.getColor() == color){
                totalVolume += item.getVolume(); // Polymorphism
            }
        }
        return totalVolume;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
}
