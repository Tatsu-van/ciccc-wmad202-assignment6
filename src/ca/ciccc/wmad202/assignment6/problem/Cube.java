package ca.ciccc.wmad202.assignment6.problem;

public class Cube extends Item{

    Cube(Color color, int height){
        super(color, height);
    }

    @Override
    public double getVolume(){
        return Math.pow(this.height, 3);
    }

    public double getTotalPrice(){
        return 0;
    }

}
