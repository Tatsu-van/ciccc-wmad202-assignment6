package ca.ciccc.wmad202.assignment6.problem;

public abstract class Item{
    public abstract double getTotalPrice();

    enum Color{
        Gray, Green, Yellow
    }

    private Color color;
    protected int height;

    Item(Color color, int height){
        this.color = color;
        this.height = height;
    }

    // --- get volume
    // --- get color

//    public double getVolume() {
//        return volume;
//    }

    public abstract double getVolume();

    public Color getColor() {
        return color;
    }

//    public int getHeight() {
//        return height;
//    }
}

