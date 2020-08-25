package com.stackroute;


class Average{
    int a,b,c;
    int sum =0;
    float av;
    void avg(int a, int b, int c)
    {
        sum = a+b+c;
        av = (float)sum/3;
        System.out.println("The average is: "+av);
    }

}
public class Main {

    public static void main(String[] args) {
	Average a = new Average();
	a.avg(3,4,5);
    }
}
