package ru.stqa.pft.sandbox;

public class Rectangle {

  public double storona1;
  public double storona2;

  public Rectangle(double a, double b) {
    this.storona1 = a;
    this.storona2 = b;
  }

  public double area () {
    return this.storona1 * this.storona2;
  }
}
