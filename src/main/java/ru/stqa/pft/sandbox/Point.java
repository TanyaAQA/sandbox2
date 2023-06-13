package ru.stqa.pft.sandbox;

public class Point {

  int x;
  int y;

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public double distance (Point p) {
    int dx = this.x - p.x;
    int dy = this.y - p.y;
    return Math.sqrt(dx * dx + dy * dy);
  }



}
