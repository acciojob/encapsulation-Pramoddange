package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();


        // Task 4: Try setting a value to 'name' directly and print it
        // Error: You will get a compilation error since 'name' is private
        // obj.name = "John";  // Uncommenting this line will result in an error
        // System.out.println(obj.name);  // Uncommenting this line will result in an error

        // Task 6: Set a value to 'name' using the setter function and access it using the getter function
        obj.setName("John");
        String retrievedName = obj.getName();
        System.out.println("Name retrieved using getter: " + retrievedName);
    }
}

  
