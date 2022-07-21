package com.java_self;

public class ojb_initialisation {
    /*Three methods to initialise an object
    1.By reference variable.
    2.By method
    3.By Constructor
     */
    //Let see by REFERENCE VARIABLE
    int age;
    String name;


    //1. By reference variable
    public static void main(String[] args){
        ojb_initialisation val1  = new ojb_initialisation();//reference variable created
        ojb_initialisation val2 =  new ojb_initialisation();

        //Now we will do the object initialisation -  use in case of "By reference method"
//        val1.age = 22;
//        val1.name = "suman";
//        System.out.println("age : " + val1.name);
//        System.out.println("name : "+ val1.age  );

        //Use in case of method 2 "By method"
        //val1.objmethod(23,"sohan");

        //Use in case of method 3 using constructors
        val1.display();

    }
    //2. By method

    public void objmethod(int a,String n ){
        age = a;
        name = n;
        System.out.println("age : " + a);
        System.out.println("name:" + n);

    }

    //3. Using constructor
        ojb_initialisation(){
        age = 24;
        name = "sohani";
        //Now create any instance method
        //Good example here - https://www.scientecheasy.com/2020/06/java-object-declaration-initialization.html/
    }
    //declare instance method and print the instance variables values.
    void display(){
        System.out.println("age : "  + age);
        System.out.println("name : " + name);

    }

}
