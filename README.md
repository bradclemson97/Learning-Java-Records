# Learning-Java-Records

In this example we want to create a class to contain fields that carry bunch-of data about something (e.g. an employee class carrying employee data like name and id) all the class does is hold the employee info and return it to the user. Records are a super simple and fast way to create a certain type of class that just holds data.

Some important attributes of a record class:
* A record class does not generate any setter methods
* Objects are immutable by default - record objects cannot be changed once created
* The record class can't be a child of any other class - all java records implicitly extend the record class
* Records are also implicitly final so can't be extended by any other class
* You are allowed to implement interfaces in your record class
