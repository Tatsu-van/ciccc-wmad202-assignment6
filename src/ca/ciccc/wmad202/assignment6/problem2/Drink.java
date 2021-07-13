package ca.ciccc.wmad202.assignment6.problem2;

import ca.ciccc.wmad202.assignment6.problem0.Product;
import ca.ciccc.wmad202.assignment6.problem1.Material;

import java.util.ArrayList;

public class Drink extends Item{
    private Boolean isProductDiet;
    private Integer productSize;
    private Integer amount;
    private double totalPrice;


    public Drink(productType type, Integer productID, String productName, Float productPrice, String productMadelInCountry,
                Boolean isProductDiet, Integer productSize, Integer amount) {
        super(type,productID, productName, productPrice, productMadelInCountry);
        this.isProductDiet = isProductDiet;
        this.productSize = productSize;
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

    public double getTotalPrice() {
        return getProductPrice() * getAmount();
    }

    public String  getProductDiet() {
        if(isProductDiet){
            return "Yes";
        }
        return "No";
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.println("For Diet: " + getProductDiet());
        System.out.println("Size: " + productSize);
        System.out.println("----------------------------------");

    }
}
