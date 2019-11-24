package Startegy;

public class Main {
    public static void main(String[] args){
      Cat[] c = {new Cat(3, 3), new Cat(4, 4),new Cat(2,2)};
      Sorter sorter = new Sorter();
      sorter.sort(c);
      for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i].weight);
       }
    }
}
