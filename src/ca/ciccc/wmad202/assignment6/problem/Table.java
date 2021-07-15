package ca.ciccc.wmad202.assignment6.problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Table {

    enum SortMetric{
        Volume, Height
    }

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

    public ArrayList<Item> getItemSortedBasedOnTheirVolume(){
        ArrayList<Item> sortedItem = new ArrayList<>();
        ArrayList<Item> copyItems = (ArrayList<Item>)(items.clone());

        for (Item item: this.items){
            double maxValue = Integer.MAX_VALUE;
            Item currentItem = null;
            for(Item item2: copyItems){
                if(item2.getVolume() <= maxValue){
                    maxValue = item2.getVolume();
                    currentItem = item2;
                }
            }
            copyItems.remove(currentItem);
            sortedItem.add(currentItem);
        }
        return sortedItem;
    }

    ArrayList<Item> getItems(){
        return this.items;
    }

    public Item getItemWithMaxVolume(){
        ArrayList<Item> sorted = getItemSortedBasedOnTheirVolume();
        return sorted.get(sorted.size() - 1);
    }

    public Item getItemWithMinVolume(){
        ArrayList<Item> sorted = getItemSortedBasedOnTheirVolume();
        return sorted.get(0);
    }

    public Item[] sortItems(){
        Item[] items = new Item[this.items.size()];
        for(int i = 0; i < this.items.size(); i++){
            items[i] = this.items.get(i);
        }
        Arrays.sort(items);
        return items;
    }

    public Item[] sortItems(SortMetric metric){
        Item[] items = new Item[this.items.size()];
        for(int i = 0; i < this.items.size(); i++){
            items[i] = this.items.get(i);
        }

        if(metric == SortMetric.Volume){
            Arrays.sort(items, new ItemVolumeComparator());
        }else if(metric == SortMetric.Height){
            Arrays.sort(items, new ItemHeightComparator());

        } else{
            return null;
        }

        return items;
    }

    public static void printItems(Item[] items){
        for(Item item: items){
            System.out.println(item);
        }
    }
}
