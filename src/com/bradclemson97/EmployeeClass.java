package com.bradclemson97;

import java.util.Objects;

public class EmployeeClass {


    private final String name;
    private final int employeeNumber;

    public EmployeeClass (String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    //To String implementation returns all the data in the class to a nice readable string format
    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }

    //Override the hashcode method with a good implementation as well
    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }

    //Equals method checks whether one instance of this class is equal to another
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return employeeNumber == that.employeeNumber && Objects.equals(name, that.name);
    }

}
