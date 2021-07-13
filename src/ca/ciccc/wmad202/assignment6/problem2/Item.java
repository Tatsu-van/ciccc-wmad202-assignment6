package ca.ciccc.wmad202.assignment6.problem2;

import ca.ciccc.wmad202.assignment6.problem0.Product;
import ca.ciccc.wmad202.assignment6.problem1.Material;
import ca.ciccc.wmad202.assignment6.problem2.Food;
import ca.ciccc.wmad202.assignment6.problem0.Object;

import java.util.ArrayList;

public abstract class Item extends Product{

    enum productType{
        Food, Drink, Cloth, Material
    }
    private productType type;

    public Item(productType type, Integer productID, String productName, Float productPrice, String productMadelInCountry) {
        super(productID, productName, productPrice, productMadelInCountry);
        this.type = type;
    }

    public productType getType() {
        return type;
    }

    public abstract double getTotalPrice();

    //    public static void item(){
//        ArrayList<Item> items = new ArrayList<>();
//
//
//        Item drink1 = new Drink(412, "Pepsi", 2.0F, "USA", false,150,3);
//
//        Drink drink2 = new Drink(183, "Ginger Zero", 3.0F, "Canada", true, 200, 1);
//
//        String ing1 = "pasta";
//        String ing2 = "meet";
//        String ing3 = "spinach";
//
//        ArrayList<String> pastaIngredients = new ArrayList<>();
//        pastaIngredients.add(ing1);
//        pastaIngredients.add(ing2);
//        pastaIngredients.add(ing3);
//
//        ArrayList<String> chickenIngredients = new ArrayList<>();
//        chickenIngredients.add("chicken");
//        chickenIngredients.add("oil");
//        chickenIngredients.add("cheese");
//
//        Food food1 = new Food(100, "Chicken", 8.0F, "Canada", 4, 350, chickenIngredients, 2);
//        Food food2 = new Food(101, "Pasta", 18.0F, "Canada", 3, 250, pastaIngredients, 2);
//
//        Material t_shirtMaterial1 = new Material(null, null, null, null, "cotton", 10);
//        Material t_shirtMaterial2 = new Material(null, null, null, null, "Nylon", 11);
//
//        ArrayList<Material> materials = new ArrayList<>();
//        materials.add(t_shirtMaterial1);
//        materials.add(t_shirtMaterial2);
//
//        Cloth cloth1 = new Cloth(701, "T-shirt", 15.0F, "china", 1, materials);
//
//        drinks.add(drink1);
//        drinks.add(drink2);
//        foods.add(food1);
//        foods.add(food2);
//        clothes.add(cloth1);
//
//        items.add(drinks);
//        items.add(foods);
//        items.add(clothes);

}
