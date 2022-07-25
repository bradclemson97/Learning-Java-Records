package com.bradclemson97;

//this single line of code gives us the equivalent of everything we created in the EmployeeClass
//records are a super simple and fast way to create a certain type of class that just holds data.

import java.util.Locale;

public record EmployeeRecord (String name, int employeeNumber){

/*A record glass does not generate any setter methods
 Objects are immutable by default - record objects cannot be changed once created
 the record class can't be a child of any other class - all java records implicitly extend the record class
 records are also implicitly final so can't be extended by any other class
 you are allowed to implement interfaces in your record class
 */

//you can create instance methods as usual
    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static void printWhatever(){
        System.out.println("Whatever");
    }

    public static final String DEFAULT_EMPLOYEE_NAME = "George";

    //cannot define your own non-static instance fields...have instead to be defined in your list of components in the main constructor above
    //private String something;

    //you can override the main constructor with your own implementation if you like, e.g. if you want to set some sort of validation on the values being set...
    //this constructor without the list of parameters and assignments is called a compact constructor (unique to record classes) - the same parameters will be automatically set
    public EmployeeRecord {
        if (employeeNumber < 0){
            throw new IllegalArgumentException("Employee number cannot be negative");
        }
    }

}