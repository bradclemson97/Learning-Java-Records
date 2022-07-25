package com.bradclemson97;

public class Main {

    /*Say we want to create a class to contain fields to carry bunch-of data about something (e.g. employee class carrying employee data like name and id)
     all the class does is hold the employee info and return it to the user
     */
    public static void main(String[] args) {

      EmployeeClass employee = new EmployeeClass("Jerry", 12345);
        System.out.println(employee.getName());
        System.out.println(employee);

      EmployeeRecord employeeRecord = new EmployeeRecord ("Kramer", 123456);
        System.out.println(employeeRecord.name());
        System.out.println((employeeRecord));
        System.out.println((employeeRecord.nameInUpperCase()));
        //Static methods are called using the name of the class itself and not a certain instance of the class
        EmployeeRecord.printWhatever();

    }
}
