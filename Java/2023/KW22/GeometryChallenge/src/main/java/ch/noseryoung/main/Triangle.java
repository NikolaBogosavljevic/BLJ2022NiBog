package ch.noseryoung.main;

import java.util.Comparator;

public class Triangle implements Comparable<Triangle> {
  private double a;
  private double b;
  private double c;

  public Triangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getShortestSide(Triangle t){
    if (t.getA() < t.getC() && t.getA() < t.getB()){
      return t.getA();
    } else if (t.getB() < t.getC() && t.getB() < t.getA()){
      return t.getB();
    } else {
      return t.getC();
    }
  }

  public double getLongestSide(Triangle t){
    if (t.getA() > t.getC() && t.getA() > t.getB()){
      return t.getA();
    } else if (t.getB() > t.getC() && t.getB() > t.getA()){
      return t.getB();
    } else {
      return t.getC();
    }
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  @Override
  public int compareTo(Triangle o) {
    return Double.compare(this.getShortestSide(this), o.getShortestSide(o));
  }
}
