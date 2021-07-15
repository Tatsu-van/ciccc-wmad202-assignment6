package ca.ciccc.wmad202.assignment6.problem;

import java.util.ArrayList;

public class TestProblem {
    public static void test(){
        Item item1 = new Cylindrical(Item.Color.Yellow, 10, 5);
        Item item3 =  new Cylindrical(Item.Color.Green, 7, 2);
        Item item6 = new Cylindrical(Item.Color.Gray, 6, 2);

        Item item2 = new Cuboid(Item.Color.Green, 3, 10, 4);
        Item item4 = new Cuboid(Item.Color.Yellow, 2, 13, 5);

        Item item5 = new Cube(Item.Color.Gray, 12);


        Table table = new Table();
        table.addItem(item1);
        table.addItem(item3);
        table.addItem(item6);
        table.addItem(item2);
        table.addItem(item4);
        table.addItem(item5);

        System.out.println("Total volume: " + table.getTotalVolume());
        System.out.println("------------------------------------------");
        System.out.println("Total volume of cuboid v1 : " + table.getTotalVolumeForCuboid());
        System.out.println("Total volume of cuboid v2 :" + table.getTotalVolume(Cuboid.class));
        System.out.println("Total volume of Cylindrical :" + table.getTotalVolume(Cylindrical.class));
        System.out.println("Total volume of Cube v2 :" + table.getTotalVolume(Cube.class));

        System.out.println("------------------------------------------");

        System.out.println("Total volume of Yellow v1 : " + table.getTotalVolumeOfYellow());
        System.out.println("Total volume of Yellow v2 :" + table.getTotalVolume(Item.Color.Yellow));
        System.out.println("Total volume of Gray :" + table.getTotalVolume(Item.Color.Gray));
        System.out.println("Total volume of Green :" + table.getTotalVolume(Item.Color.Green));

        System.out.println("------------------------------------------");

        ArrayList<Item> sorted = table.getItemSortedBasedOnTheirVolume();
        for(Item item: sorted){
            System.out.println(item);
        }

        Item maxItem = table.getItemWithMaxVolume();
        System.out.println("Max item: " + maxItem);
        Item minItem = table.getItemWithMinVolume();
        System.out.println("Min item: " + minItem);

        System.out.println("------------------------------------------");
        Item[] sortItems = table.sortItems();
        Table.printItems(sortItems);


        System.out.println("------------------------------------------");
        Item[] sortedItem1 = table.sortItems(Table.SortMetric.Volume);
        Table.printItems(sortedItem1);

        System.out.println("------------------------------------------");

        Item[] sortedItem2 = table.sortItems(Table.SortMetric.Height);
        Table.printItems(sortedItem2);
    }
}
