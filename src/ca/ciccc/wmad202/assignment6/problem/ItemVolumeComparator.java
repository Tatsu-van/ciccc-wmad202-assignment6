package ca.ciccc.wmad202.assignment6.problem;

import java.util.Comparator;

public class ItemVolumeComparator implements Comparator<Item> {

    public int compare(Item o1, Item o2){

        if(o1.getVolume() == o2.getVolume()){
            return 0;
        } else if(o1.getVolume() <= o2.getVolume()){
            return -1;
        } else{
            return 1;
        }
    }
}
