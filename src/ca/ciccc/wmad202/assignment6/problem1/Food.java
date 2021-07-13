package ca.ciccc.wmad202.assignment6.problem1;

import ca.ciccc.wmad202.assignment6.problem0.Product;

import java.util.ArrayList;

public class Food extends Product {
    private Integer productCalorie;
    private Integer productSize;
    private ArrayList<String> foodIngredients;

    public Food(Integer productID, String productName, Float productPrice, String productMadelInCountry, Integer productCalorie, Integer productSize, ArrayList<String> foodIngredients) {
        super(productID, productName, productPrice, productMadelInCountry);
        this.productCalorie = productCalorie;
        this.productSize = productSize;
        this.foodIngredients = foodIngredients;
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.println("Calories: " + productCalorie);
        System.out.println("Size: " + productSize);
        System.out.println("Ingredients: " + foodIngredients.toString());
    }
}