package com.company;
//this code snipet is for variables java

 /*
 Teacher notes
	Instance & Static:
	- Declared at class-level
	- Scope: Entire class
	- Gets default value
	- Cannot be re-initialized directly within class

	Instance: Represents object state

	- Values are unique to object
	- From outside class: Accessible via object reference

	Static:

	- Values are unique to class ~ One copy per class (shared across objects)
	- From outside class: Accessible via Class Name or object reference

	Instance & static variables are also referred to as fields or attributes. Attributes is probably more commonly associated with instance variables.
*/
public class Student {
    static int computecount;//static keywords makes it a global variable hence it is no more dependent on object.
    int id=1000;
    byte age = 18;//correct
    //byte rank = 165;//incorrect as byte range is from [-127 to 127]
    short rank = 165;//correct
    long phone = 2234567890L;
    long phonee= 223_456_7890L;//THIS IS JUST FOR READABILTY,THIS IS ALSO CORRECT FORM JAVA 7 ONWARDS
    long intHex= 0x0041L;// x can be capital;16 power 0 * 1 + 16 power 1*4 + .. = 65 ;hexadecimal number
    int intbinary=0b0100_0001;// b can be capital;underscore is optional and this represents binary number;
    int intoctal= 0101;//this is octal starts with 0 and then followed by number base 8

    float gpa = 3.8f;//if f is not included then it will be a double type
    double gppa =3.8; //correct
    float sgpa = 4.00000000000088888000f;//digits are truncated in output as float precision is till 7 digits.
    double fpga=3.987635e56; //digits are truncated in output as double precision is till 15 digits.
    char degree= 'B';
    //char degree = 'BA' this will give error as more than one symbol.
    //char degree ='';this will also give error;
    //char degree = ' ' this is ok;
    //char degree = '\u0042'; this is also correct as the value inside is unicode value for B in UTF 16.
     char charint=65;
     char charhex=0x0041;
     char charbinary= 0b0100_0001;
     boolean international = true; //incase if boolean is not declared true/false it is by default false.
     double tuitionfees = 12000.0;
     double internationalfees= 5000.0;
     String name; //We can hardcore the values of the string and other variable here as done above are we can simply declare them by using dot operator as shown below in the main method by using object reference method.
     String gender;

     // All the above declared are instance variable of  object of the class.These are specific to the object of the class.
    //below declared variable inside the method/function are local variable and are specific to the method.
    //static variable are class variable as they are specific to the class.These are unique to the class.









    //Integer literals(types): int literal,long literal
    void compute(){
        computecount = computecount+1;
        int nextid=id+1;//this is a local variable and these cannot accessed outside the method.The scope is within the method.
        System.out.println("id:" + id);
        //System.out.println("nextid:"+ nextid);
        System.out.println("age:"+ age);
        System.out.println("rank:"+ rank);
        System.out.println("long:"+ phone);
        System.out.println("phonee:"+ phonee);
        System.out.println();
        System.out.println("Indside primitives");
        System.out.println("inthex:"+ intHex);
        System.out.println("intbinary:"+ intbinary);
        System.out.println("intoctal:" + intoctal);
        System.out.println("charbinary" + charbinary);
        System.out.println("charhex" + charhex);
        System.out.println("charint"+ charint);
        System.out.println();
        System.out.println("float:" + gpa);
        System.out.println("double:" + gppa);
        System.out.println("float:" + sgpa);
        System.out.println("float:" + fpga);
        System.out.println("character type:" + degree);
        if (international) { //here no need to explicitly equate international to true,if (international== true){
            tuitionfees=tuitionfees+internationalfees;
        }
        System.out.println("Tuitionfees:" + tuitionfees);
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("\ncomputecount:"+computecount);




    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name="John";
        s1.gender= "male";
        //similarly we can declare other variable here with different object if needed , hence only hardcode things that needs to be common in all the objects created.
        s1.compute();

        s2.name="johny english";
        s2.gender="male";
        s2.compute();


    }

}
