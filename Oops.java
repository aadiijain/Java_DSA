import java.util.*;//Built-in Package
//import bank; //User-Defined Package
class Pen{ //class
    String color; //properties of class known as "Data"
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){ //Functions of a class known as "Members"
        System.out.println(this.color); //this keyword in java tells us which object in code trying to access that method
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
       System.out.println(this.name);
       System.out.println(this.age);
    }
    Student(){ //Non Parameterized Constructor
        System.out.println("Constructor Called");
    }
    Student(String name, int age){ //Parametrized Constructor
        this.name = name;
        this.age = age;
    }
    Student(Student s3){ //Copy Constructor
        this.name = s3.name;
        this.age = s3.age;
    }
      //Polymorphism functions of same name but doing different tasks
    public void printInfo(String name){
        System.out.println(name);
    }
    
    public void printInfo(int age){
        System.out.println(age);
    }
    
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}
//Inheritance
class Shape { //Base or Parent Class
    String color;
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{ //Derived or Sub or Child Class
 public void area(int l,int h){
    System.out.println(1/2*l*h);        //Single level inheritance
 }
}
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);       //multiple level inheritance 
    }
}
class Circle extends Shape{      //Hierarchial Inheritance

} 
//Hybrid Inheritance - mix of multiple types of inheritance
//Multiple Inheritance - inheriting from more than one parent;not in java instead java has interfaces
//Encapsulation - data hiding and access control; process of making class 
//Abstraction - Hiding details and showing only important stuff
abstract class Animal{
    abstract void walk();//Abstrcted function
    Animal(){ //Constructor can be there inside abstracted class
        System.out.println("Creatin Constructor Animal");
    }
    public void eat(){
        System.out.println("eats");//non abstracted function inside abstracted class
    }
}
class Horse extends Animal{
    Horse(){
        
        System.out.println("cretaed horse");
    }
    public void walk(){ 
        System.out.println("walks on 4");
    }

}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2");
    }
}

//Interfaces 
interface Animal1{
    int eyes = 2;//All the fields in interfaces are public, static and final by default.
    /*public*/ void walk1(); //All methods are public & abstract by default.
    //Animal(){} interface cant have constructors
    //void eat(){}interface cant have non abstract function or implementation
}
interface Herbivore{

}
class Horse1 implements Animal1{ 
 public void walk1(){
    System.out.println("walks");
 }
}
//class Horse2 implements Animal1, Herbivore{//Interfaces support the functionality of multiple inheritance. 

//}

//Static Keyword - Excessible to all unlike public but it is those properties common to a class
class Student1{
    String name;
    static String school; //school name satic or same for all students
    //functions could be static as well as
    public static void changeSchool(){
        school="newschoolname";
    }
}

public class Oops {
    public static void main(String[] args) {
     Pen pen1 = new Pen(); //object
     pen1.color = "blue";
     pen1.type = "gel";
     Pen pen2 = new Pen();
     pen2.color="black";
     pen2.type="ballpoint";
     pen1.printColor();
     pen2.printColor();   

     Student s1=new Student(); //new keyword allocates space in the memory heap to store object. Student() : Constructor Function it is of non parametrized type created by default by java
     s1.name="Aadi";
     s1.age=22;
     s1.printInfo();
     //Parametrized Constructor
     Student s2=new Student("Shreya",23);
     s2.printInfo();
     //Copy Constructor
     Student s3=new Student(s1);
     s3.printInfo();
      //Polymorphism
     s1.printInfo(s1.name);
     s1.printInfo(s1.age);
     s1.printInfo(s1.name, s1.age);
     //Inheritance
     Triangle t1 = new Triangle();
     t1.color="red";
     //Encapsulation
     //bank.Account account1 = new bank.Account();
     //account1.name = "Customer1"; 
     //Abstraction
     //Horse horse1 = new Horse();
     //horse1.walk();

     //Animal animal = new Animal();//abstract class can not be instantiated i.e. of whose object cannot be formed
     //animal.walk();//throws "runtime" error 

    //horse1.eat();
    Horse horse = new Horse();// constructor chaining initially constructor of base class is called after that constructor of derived class is called
    //abstract class can have final methods which will force subclass not to change body the body of method 
    Horse1 horseA = new Horse1();
    horseA.walk1();
//A class that implements an interface must implement all the methods declared in the interface.
    
//Static things are directly accessible through class because static things are associated with class and not object
Student1.school = "JMV";
//but "name" will accessed using object as 
Student1 StudentA = new Student1();
StudentA.name="tony"; 
System.out.println(StudentA.school);
/*Static keyword can be used in 4 ways 
 * 1. infront of properties
 * 2. infront of functions
 * 3.infront of blocks
 * 4. inside nested classes
 * 
 * memory is given only once to static things and multiple times to objects
 * so to save memory or incase of common things use static
 */

 //all in all OOPs is about systemizing things while dealing with real world entities
}
}
