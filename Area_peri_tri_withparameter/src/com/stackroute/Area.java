package com.stackroute;

class Triangle {
    int a, b, h;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.h = c;
        int area = (b * h) / 2;
        System.out.println("Area of the Triangle is : " + area);
        int per = a + b + h;
        System.out.println("Perimeter of the triangle is : " + per);
    }

}
public class Main {

    public static void main(String[] args) {
        Triangle t = new Triangle(10, 20, 17);

    }
}

