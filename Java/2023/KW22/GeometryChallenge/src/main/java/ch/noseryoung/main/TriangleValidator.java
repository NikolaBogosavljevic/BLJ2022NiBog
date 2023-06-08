package ch.noseryoung.main;

public class TriangleValidator {

  /**
   * Checks if the Triangle is equilateral or not.
   * Returns only true if all sides equal the same lengths.
   *
   * @param t triangle to be evaluated
   * @return true the triangle is equilateral , false if not
   */
  public boolean isEquilateral(Triangle t){
    if (t.getA() == t.getB() && t.getA() == t.getC()){
      return true;
    }
    return false;
  }

  /**
   * Checks if the Triangle is equilateral or not.
   * Returns only true if two sides equal the same lengths.
   *
   * @param t triangle to be evaluated
   * @return true the triangle is equilateral , false if not
   */
  public boolean isIsosceles(Triangle t){
    if (t.getA() == t.getB() || t.getA() == t.getC() || t.getC() == t.getB()){
      return true;
    }
    return false;
  }

  /**
   * Checks if the Triangle is a valid triangle.
   *
   * @param t triangle to be evaluated
   * @return true the triangle is scalene, false if not
   */
  public boolean isScalene(Triangle t){
    return isValidTriangle(t) && !isIsosceles(t);
  }

  public boolean isValidTriangle(Triangle t){
    if(t.getA() <= 0 || t.getB() <= 0 || t.getC() <= 0){
      return false;
    }
    double angleA = Math.toDegrees(Math.acos((t.getB() * t.getB() + t.getC() * t.getC() - t.getA() * t.getA()) / (2 * t.getB() * t.getC())));
    double angleB = Math.toDegrees(Math.acos((t.getA() * t.getA() + t.getC() * t.getC() - t.getB() * t.getB()) / (2 * t.getA() * t.getC())));
    double angleC = Math.toDegrees(Math.acos((t.getA() * t.getA() + t.getB() * t.getB() - t.getC() * t.getC()) / (2 * t.getA() * t.getB())));

    return (angleA + angleB + angleC) == 180.0;
  }

}
