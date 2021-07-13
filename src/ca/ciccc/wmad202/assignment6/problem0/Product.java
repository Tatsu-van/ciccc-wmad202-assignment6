package ca.ciccc.wmad202.assignment6.problem0;

import ca.ciccc.wmad202.assignment6.problem1.Material;

import java.util.ArrayList;

public class Product extends Object{

    public Product(Integer productID, String productName, Float productPrice, String productMadelInCountry){
        super(productID, productName, productPrice, productMadelInCountry);
    }

    @Override
    public void getProductInfo(){
        System.out.println("ID: " + this.productID);
        System.out.println("Name: " + this.productName);
        System.out.println("Price: " + this.productPrice);
        System.out.println("Made In: " + this.productMadelInCountry);
    }

    @Override
    public Integer getProductID() {
        return null;
    }

    @Override
    public String getProductName() {
        return null;
    }

    @Override
    public Float getProductPrice() {
        return null;
    }

    @Override
    public String getProductMadeInCountry() {
        return null;
    }

    @Override
    public Integer getProductSize() {
        return null;
    }

    @Override
    public Boolean getIsProductDiet() {
        return null;
    }

    @Override
    public Integer getProductCalorie() {
        return null;
    }

    @Override
    public ArrayList<String> getProductIngredients() {
        return null;
    }

    @Override
    public Integer getAmount() {
        return null;
    }

    @Override
    public Material getMaterial() {
        return null;
    }


}
