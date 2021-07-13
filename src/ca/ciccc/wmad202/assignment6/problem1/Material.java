package ca.ciccc.wmad202.assignment6.problem1;

import ca.ciccc.wmad202.assignment6.problem0.Product;

import java.util.ArrayList;

public class Material extends Product{
    private String materialName;
    private Integer materialCode;
    private ArrayList material = new ArrayList();

    public Material(Integer productID, String productName, Float productPrice, String productMadelInCountry,String materialName, Integer materialCode){
        super(productID, productName, productPrice, productMadelInCountry);
        this.materialName = materialName;
        this.materialCode = materialCode;
    }

    public void getProductInfo() {
        System.out.println("Material: " + materialName);
        System.out.println("Material code: " + materialCode);
    }

}
