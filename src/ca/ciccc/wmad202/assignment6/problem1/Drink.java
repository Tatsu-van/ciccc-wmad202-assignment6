package ca.ciccc.wmad202.assignment6.problem1;

import ca.ciccc.wmad202.assignment6.problem0.Product;

public class Drink extends Product {
    private Boolean isDrinkDiet;
    private Integer drinkSize;

    public Drink(Integer productID, String productName, Float productPrice, String productMadelInCountry, Boolean isDrinkDiet, Integer drinkSize){
        super(productID, productName, productPrice, productMadelInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize =  drinkSize;
    }

    @Override
    public void getProductInfo() {
        super.getProductInfo();
        System.out.println("For Diet: " + isDrinkDiet);
        System.out.println("Size: " + drinkSize);
    }


}
