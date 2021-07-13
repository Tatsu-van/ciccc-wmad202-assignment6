package ca.ciccc.wmad202.assignment6.problem2;

import java.util.ArrayList;

public class Material extends Item{
    private String materialName;
    private String materialCode;
    private ArrayList material = new ArrayList();

    public Material(productType type,Integer productID, String productName, Float productPrice, String productMadelInCountry,String materialName, String materialCode){
        super(type, productID, productName, productPrice, productMadelInCountry);
        this.materialName = materialName;
        this.materialCode = materialCode;
        addMaterial();
    }

    public void getProductInfo() {
        System.out.println("Material: " + materialName);
        System.out.println("Material code: " + materialCode);
    }

    public ArrayList<String> addMaterial(){
        material.add(materialName);
        material.add(materialCode);
        return material;
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

    public String getMaterialName(){
        return materialName;
    }

    public String  getMaterialCode(){
        return materialCode;
    };

    public ArrayList<String> getMaterialList() {
        return material;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}
