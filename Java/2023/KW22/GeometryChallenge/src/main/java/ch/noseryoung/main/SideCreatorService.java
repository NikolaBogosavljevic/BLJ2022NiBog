package ch.noseryoung.main;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SideCreatorService implements ShapeSideCreator{

  /**
   * This method generates a random <code>double</code>, rounded to .0 or .5.
   *
   * @return the generated value, to be used as a side for a shape
   */
  @Override
  public double createSide() {
    double max = 100;
    double min = 0;
    double side = ((ThreadLocalRandom.current().nextDouble() * (max - min)) + min) ;
    return Math.round(side * 2) / 2.0;
  }
}
