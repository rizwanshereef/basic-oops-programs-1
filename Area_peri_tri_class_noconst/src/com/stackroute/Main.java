package com.stackroute;

class Triangle{
    int a=9;
    int b=14;
    int c=25;
    int h=11;
    int area=0;
    int per=0;
    void area(){
        area =(b*h)/2;
        System.out.println("Area of the Triangle is : "+area);
    }
    void perimeter(){
        per=a+b+c;
        System.out.println("Perimeter of the triangle is : "+per);
    }
}
public class Main {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.area();
        t.perimeter();
    }
}
