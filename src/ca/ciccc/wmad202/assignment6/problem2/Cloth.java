package ca.ciccc.wmad202.assignment6.problem2;

import ca.ciccc.wmad202.assignment6.problem2.Material;

import java.util.ArrayList;

public class Cloth extends Item {
    private Integer amount;
    private ArrayList<Material> materials;
    private double totalPrice;

    public Cloth(productType type, Integer productID, String productName, Float productPrice, String productMadelInCountry,
                Integer amount, ArrayList<Material> materials) {
        super(type, productID, productName, productPrice, productMadelInCountry);
        this.amount = amount;
        this.materials = materials;
    }




    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.print("Materials: ");
        for(Material material : materials){
            System.out.print(material.getMaterialName() + ", ");
        }
        System.out.println();
        System.out.println("----------------------------------");
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

    @Override
    public double getTotalPrice() {
        return getProductPrice() * getAmount();
    }




}
