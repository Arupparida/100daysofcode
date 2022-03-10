package com.company;
//There are 3 ways to create a array
public class arrayclass {
    //static int[] scores;
    static void arrays(){
        int[] scores = new int[4];//First way of creating array
        //can use this when have a long array requirement;
//        scores[1]=90;
//        scores[2]=91;
//        scores[3]=92;
//        scores[4]=93;

        //int[] scores= new int[]{95,96,97,98}; //2nd way of creating an array

        //int[] scores={94,95,96,97};//3rd way of creating an array;



        System.out.println("term 1 marks:"+ scores[0]);
        System.out.println("term 2 marks:" + scores[1]);
        System.out.println("Final marks:"+ scores[2]);
        System.out.println("Project marks:" + scores[3]);
        //System.out.println("negative marks:"+ scores[-1]); //this will throw exception error.
        System.out.println("no.of exams:"+ scores.length); //it cannnot be scores.length(); as length is a not a method here although length method exist incase of strings.

        //First approach of creating array
        Student[] students=new Student[3]; //array that stores object refences;
        students[0]= new Student();
        students[1]=new Student();
        students[2]=new Student();//self explaination : first you create an object for arrays and then object for each array element.


        //2nd Approach of creating an array;
//        Student[] students =  new Student[]{new Student(),new Student(),new Student()};
//        System.out.println("");

        //3rd appoach of creating an array;
        //Student[] students={new Student(), new Student(),new Student()};

        students[0].name = "josh";
        students[1].gender = "male";
        students[2].age= 18;


        System.out.println("student1:"+ students[0]);
        System.out.println("student2:"+ students[1]);
        System.out.println("student3:"+ students[2]);

        System.out.println("student1:"+ students[0].name);
        System.out.println("student2:"+ students[1].gender);
        System.out.println("student3:"+ students[2].age);

    }
    public static void main(String[] args){
        arrays();

    }
}
