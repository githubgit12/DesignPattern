package Startegy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
      Dog[] c = {new Dog(3), new Dog(5),new Dog(1)};
      Sorter sorter = new Sorter();
      sorter.sort(c);
      System.out.println(Arrays.toString(c));


    }
            }
