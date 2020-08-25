package com.stackroute;
//creating class Student with name,roll_no,phone_no,address and method to display the details.
class Student
        {
            String name;
            int roll_no;
            int phone_no;
            String address;

            void display()
            {
                System.out.println("Name:"+name);
                System.out.println("Roll no: "+roll_no);
                System.out.println("Phone no: "+phone_no);
                System.out.println("Address:"+address);

            }
        }
public class Main {
// Creating main void main class and declaring the object of class Student
    public static void main(String[] args) {
	Student Sam = new Student();
	Student John = new Student();

	Sam.name="Sam";
	Sam.roll_no=1;
	Sam.phone_no=123456789;
	Sam.address= "Address1_test";

	John.name="John";
	John.roll_no=2;
	John.phone_no=9876543;
	John.address= "Address2_test";

	Sam.display();
	John.display();

    }
}
