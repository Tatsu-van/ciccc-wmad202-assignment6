package ca.ciccc.wmad202.assignment6.problem2;

import java.util.ArrayList;

public class ShoppingCartTest {

    public static void test() {

        ArrayList<Item> items = new ArrayList<>();

        Item drink1 = new Drink(Item.productType.Drink, 412, "Pepsi", 2.0F, "USA", false, 150, 3);
//
        Item drink2 = new Drink(Item.productType.Drink, 183, "Ginger Zero", 3.0F, "Canada", true, 200, 1);
//
        String ing1 = "pasta";
        String ing2 = "meet";
        String ing3 = "spinach";

        ArrayList<String> pastaIngredients = new ArrayList<>();
        pastaIngredients.add(ing1);
        pastaIngredients.add(ing2);
        pastaIngredients.add(ing3);

        ArrayList<String> chickenIngredients = new ArrayList<>();
        chickenIngredients.add("chicken");
        chickenIngredients.add("oil");
        chickenIngredients.add("cheese");

        Food food1 = new Food(Item.productType.Food, 100, "Chicken", 8.0F, "Canada", 350, 4, chickenIngredients, 2);
        Food food2 = new Food(Item.productType.Food, 101, "Pasta", 18.0F, "Canada", 250, 3, pastaIngredients, 2);

        Material t_shirtMaterial1 = new Material(Item.productType.Material, null, null, null, null, "cotton", "10");
        Material t_shirtMaterial2 = new Material(Item.productType.Material, null, null, null, null, "Nylon", "11");

        ArrayList<Material> materials = new ArrayList<>();
        materials.add(t_shirtMaterial1);
        materials.add(t_shirtMaterial2);

        Cloth cloth1 = new Cloth(Item.productType.Cloth,701, "T-shirt", 15.0F, "china", 1, materials);

        items.add(drink1);
        items.add(drink2);
        items.add(food1);
        items.add(food2);
        items.add(cloth1);


        ShoppingCart sp = new ShoppingCart(items);
        sp.getProductInfo();
        double totalPrice = sp.getTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }

}
