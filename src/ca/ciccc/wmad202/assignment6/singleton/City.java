package ca.ciccc.wmad202.assignment6.singleton;

public class City {

    private String name;
    private String province;

    City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String toString(){
        return "[ " +  this.name + " , " +  this.province + " ]";
    }
}
