package ca.ciccc.wmad202.assignment6.singleton;

public class TestSingleton {
    public static void main(String[] args){
//        City city1 = new City("Vancouver", "BC");
//        City city2 = new City("Calgary", "Alberta");
//        City city3 = new City("Toronto", "Ontario");
//
//        System.out.println(city1);
//        System.out.println(city2);
//        System.out.println(city3);

        Country country1 = new Country();
        Country country2 = new Country();
        Country country3 = new Country();
        Country country4 = new Country();

        System.out.println(country1);
        System.out.println(country2);
        System.out.println(country3);
        System.out.println(country4);

        // We want to make sure there is only one instance from class
    }
}
