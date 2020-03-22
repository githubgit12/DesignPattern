package Startegy;

public class Cat implements Comparable{
     int weight,height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Object o){
        Cat c = (Cat)o;
        if(this.weight < c.weight) return -1;
        else if (this.weight >c.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
