package ca.ciccc.wmad202.assignment6.problem0;

import ca.ciccc.wmad202.assignment6.problem1.Cloth;
import ca.ciccc.wmad202.assignment6.problem1.Drink;
import ca.ciccc.wmad202.assignment6.problem1.Food;
import ca.ciccc.wmad202.assignment6.problem1.Material;

import java.util.ArrayList;

public class ApplicationDriver{

    public static void test(){
//        Product pr1 = new Product(110, "Diet Pepsi", 2, "USA");
//        pr1.getProductInfo();
//
//        Product pr2 = new Product(120, "Canada Dry" , 1, "CANADA");
//        pr2.getProductInfo();

        Drink drink = new Drink( 110, "Diet Pepsi", 2.0F, "USA", true, 500);

        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("cheese");
        ingredients.add("meat");
        ingredients.add("bread");
        ingredients.add("cabbage");
        Food food = new Food(100, "Cheeseburger", 3.0F, "Canada", 500, 100, ingredients);

        ArrayList<String> materials = new ArrayList<>();
        materials.add("cotton");
        materials.add("polyester");
        Cloth cloth = new Cloth(190, "foodie", 10.0F, "Japan", materials);

        Material material = new Material(null, null,null,null,"wool", 12345);

        drink.getProductInfo();
        System.out.println("------------------------------------------");
        food.getProductInfo();
        System.out.println("------------------------------------------");
        cloth.getProductInfo();
        System.out.println("------------------------------------------");
        material.getProductInfo();
    }

}
