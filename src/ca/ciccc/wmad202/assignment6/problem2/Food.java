package ca.ciccc.wmad202.assignment6.problem2;

import ca.ciccc.wmad202.assignment6.problem0.Product;
import ca.ciccc.wmad202.assignment6.problem1.Material;

import java.util.ArrayList;

public class Food extends Item {
    private Integer productCalorie;
    private Integer productSize;
    private ArrayList<String> foodIngredients;
    private Integer amount;

    public Food(productType type, Integer productID, String productName, Float productPrice, String productMadelInCountry, Integer productCalorie, Integer productSize, ArrayList<String> foodIngredients, Integer amount) {
        super(type, productID, productName, productPrice, productMadelInCountry);
        this.productCalorie = productCalorie;
        this.productSize = productSize;
        this.foodIngredients = foodIngredients;
        this.amount = amount;
    }

    @Override
    public Integer getProductID(){
        return productID;
    }

    public String getProductName(){
        return productName;
    }

    public Float getProductPrice(){
        return productPrice;
    }

    public String getProductMadeInCountry(){
        return productMadelInCountry;
    }

    public Integer getAmount(){
        return amount;
    }

    public Integer getProductSize() {
        return productSize;
    }

    public double getTotalPrice() {
        return getProductPrice() * getProductSize() * getAmount();
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.println("Calorie: " + productCalorie);
        System.out.println("Size: " + productSize);
        System.out.print("Ingredients: ");
        for(String item : foodIngredients){
            System.out.print(item + ", ");
        }
        System.out.println();
        System.out.println("----------------------------------");

    }

    //    private Integer productSize;
//    private Integer productCalorie;
//    private ArrayList<String> productIngredients;
//    private Integer amount;
//
//    public Food(Integer productID, String productName, Float productPrice, String productMadelInCountry,
//                Integer productSize, Integer productCalorie, ArrayList<String> productIngredients, Integer amount) {
//        super(productID, productName, productPrice, productMadelInCountry);
//        this.productSize = productSize;
//        this.productCalorie = productCalorie;
//        this.productIngredients = productIngredients;
//        this.amount = amount;
//    }
//
//    public double calculateSum(){
//        double sum = this.productPrice * this.productSize;
//        return sum;
//    }
//
//
//    @Override
//    public void getProductInfo() {
//        super.getProductInfo();
//        System.out.println("Calories: " + productCalorie);
//        System.out.println("Size: " + productSize);
//        System.out.println("Ingredients: " + productIngredients.toString());
//    }
//
//    @Override
//    public Integer getProductID(){
//        return productID;
//    }
//
//    public String getProductName(){
//        return productName;
//    }
//
//    public Float getProductPrice(){
//        return productPrice;
//    }
//
//    public String getProductMadeInCountry(){
//        return productMadelInCountry;
//    }
//
//    public Integer getProductSize(){
//        return productSize;
//    }
//
//    public Integer getProductCalorie(){
//        return productCalorie;
//    }
//
//    public ArrayList<String> getProductIngredients(){
//        return productIngredients;
//    }
//
//    public Integer getAmount(){
//        return amount;
//    }
//
//    public double getTotalPrice(){
//        return calculateSum();
//    }
}