package ca.ciccc.wmad202.assignment6.problem1;

import ca.ciccc.wmad202.assignment6.problem0.Product;

import java.util.ArrayList;

public class Cloth extends Product {
    private ArrayList<String> productMaterial;

    public Cloth(Integer productID, String productName, Float productPrice, String productMadelInCountry, ArrayList<String> productMaterial){
        super(productID, productName, productPrice, productMadelInCountry);
        this.productMaterial = productMaterial;
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.print("Materials: ");
        for(String material : productMaterial){
            System.out.print(material+ ", ");
        }
        System.out.println();
    }
}
