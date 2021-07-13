package ca.ciccc.wmad202.assignment6.problem2;

import java.util.ArrayList;
import ca.ciccc.wmad202.assignment6.problem2.Item;

public class ShoppingCart {


        private ArrayList<Item> items;

        ShoppingCart(ArrayList<Item> items){
                this.items = items;
        }

        public double getTotalPrice(){
                double totalPrice = 0;
                for(Item item : items){
                        totalPrice += item.getTotalPrice();
                }
                return totalPrice;
        }

        public void getProductInfo(){
                for(Item i : items){
                        i.getProductInfo();
                }
        }


}
