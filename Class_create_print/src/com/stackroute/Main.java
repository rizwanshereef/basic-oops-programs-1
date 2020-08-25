package com.stackroute;
//creating class Student with roll_no,phone_no,address and method to display the details.
class Student
        {
            int roll_no;
            int phone_no;
            String address;
            Student(int roll_no, int phone_no,String address){
                this.roll_no = roll_no;
                this.phone_no =phone_no;
                this.address = address;
            }
            void display()
            {
                System.out.println("Roll no: "+roll_no);
                System.out.println("Phone no: "+phone_no);
                System.out.println("Address:"+address);

            }
        }
public class Main {
// Creating main void main class and declaring the object of class Student
    public static void main(String[] args) {
	Student Sam = new Student(1,123456789,"Address1_test");
	Student John = new Student(2, 9876543,"Address2_test");
	Sam.display();
	John.display();

    }
}
