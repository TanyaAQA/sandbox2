package ru.stqa.pft.sandbox;

public class MyFirstSoft {
    public static void main(String[] args) {
        Hello(123);

      Square s = new Square(5);
      System.out.println("Площадь квадрата со стороной " + s.len + " = " + s.ploshad());

      Rectangle r = new Rectangle(4, 6);
           System.out.println("Площадь прямоугольника со сторонами " + r.storona1 + " и " + r.storona2 + " = " + r.area());

      Point p1 = new Point(0,0);
      Point p2 = new Point (1,3);
      // Если хотим просто упомянуть названия точек, то пишем:
      // System.out.println("Расстояние межу точками p1 и p2 = " + p1.distance(p2));

      // Если хотим с нормальным указанием координат, то:
      System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ") и (" + p2.x + ", " + p2.y + ") равно " + p1.distance(p2));
    }

    public static void Hello (int somebody) {
           System.out.println("Hello " + somebody + "!");
    }

    }
