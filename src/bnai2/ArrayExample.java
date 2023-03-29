package bnai2;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random cd=new Random();
        Integer [] arr= new Integer[100];
        System.out.println("Phan tu cua mang :");
        for (int i=0;i<100;i++){
            arr[i]=cd.nextInt(100);
            System.out.println(arr[i] +"  ");
        }
        return arr;
    }

}
