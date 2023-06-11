package ru.stqa.pft.sandbox;

public class MyFirstSoft {
    public static void main(String[] args) {
        Hello(123);

        int len = 5;
      System.out.println("Площадь квадрата со стороной " + len + " = " + ploshad(len));


      double storona1 = 4;
      double storona2 = 6;
      System.out.println("Площадь прямоуга со сторонами " + storona1 + "и" + storona2 + " = " + area(storona1, storona2));

    }

    public static void Hello (int somebody) {
           System.out.println("Hello " + somebody + "!");
    }

    public static int ploshad (int a) {
      return a * a;
    }

    public static double area (double b, double c) {
      return b * c;
    }
}