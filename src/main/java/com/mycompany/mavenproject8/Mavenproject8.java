/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

/**
 *
 * @author Oleh
 */
public class Mavenproject8 {

    public static void main(String[] args) {
        Person kate = new Person("Kate", 32, "Streat45");
        kate.displayName();
        kate.displayAge();
        kate.displayAddress();
          
            
    }
}
class Person{
    String name;
    protected int age;
    String address;
    
    Person(String name, int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayName(){
        System.out.printf("Name: %s\n",name);
    }
    void displayAge(){
        System.out.printf("Age: %d\n",age);
    }
    void displayAddress(){
        System.out.printf("Street: %s\n",address);
}
}