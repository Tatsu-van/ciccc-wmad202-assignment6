package ca.ciccc.wmad202.assignment6.problem;

public class Cuboid extends Item{

    private int width;
    private int length;

    Cuboid(Color color,  int height, int width, int length){
        super(color,  height);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getVolume() {
        return this.length * this.width * this.height;
    }

    public double getTotalPrice(){
        return 0;
    }
}
