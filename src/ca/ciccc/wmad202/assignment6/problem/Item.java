package ca.ciccc.wmad202.assignment6.problem;

public abstract class Item implements Comparable<Item>{
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


    public int getHeight() {
        return height;
    }

    public abstract double getVolume();

    public Color getColor() {
        return color;
    }

    public String toString(){
        String result = "[ " + String.valueOf(getVolume()) + " , " + String.valueOf(this.height) +" ]";
        return result;
    }


    public int compareTo(Item anotherItem){
        if(this.getVolume() == anotherItem.getVolume()){
            return 0;
        } else if(this.getVolume() <= anotherItem.getVolume()){
            return -1;
        } else{
            return 1;
        }
    }

}

