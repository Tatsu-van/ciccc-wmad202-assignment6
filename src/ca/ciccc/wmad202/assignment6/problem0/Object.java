package ca.ciccc.wmad202.assignment6.problem0;

import ca.ciccc.wmad202.assignment6.problem1.Material;

import java.util.ArrayList;

public abstract class Object {

    protected Integer productID;
    protected String productName;
    protected Float productPrice;
    protected String productMadelInCountry;

    public Object(Integer productID, String productName, Float productPrice, String productMadelInCountry) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadelInCountry = productMadelInCountry;
    }

    public abstract void getProductInfo();

    public abstract Integer getProductID();

    public abstract String getProductName();

    public abstract Float getProductPrice();

    public abstract String getProductMadeInCountry();

    public abstract Integer getProductSize();

    public abstract Boolean getIsProductDiet();

    public abstract Integer getProductCalorie();

    public abstract ArrayList<String> getProductIngredients();

    public abstract Integer getAmount();

    public abstract Material getMaterial();

}
