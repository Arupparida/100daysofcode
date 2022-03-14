package com.company;

public class studentin {
    static void go(int[] array){
        System.out.println("array[0]:" + array[0]);
        System.out.println("array[1]:" + array[1]);
        array[1]=22;
    }


//    void compute(){
//        System.out.println(id2);
//    }
    public static void main(String[] args) {
        // write your code here
        int[] array={1,2};
        go(array); //This line and the above line are accessing the same object and hence the values of array[2] is updated once above line is excuted.
        System.out.println("array[1]:"+ array[1]);

    }//This example is on how data is passed to methods in java
}
