package ca.ciccc.wmad202.assignment6.problem;

public class Cylindrical extends Item{

    private int radius;

    Cylindrical(Color color, int height, int radius){
        super(color, height);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.pow(this.radius, 2) * this.height * 3.14;
    }

    public double getTotalPrice(){
        return 0;
    }
}
