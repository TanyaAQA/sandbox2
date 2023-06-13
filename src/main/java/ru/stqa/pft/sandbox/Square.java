package ru.stqa.pft.sandbox;

public class Square {

  public int len;
  public Square(int l) {
    this.len = l;
  }

  public int ploshad() {
    return this.len  * this.len;
  }

}
