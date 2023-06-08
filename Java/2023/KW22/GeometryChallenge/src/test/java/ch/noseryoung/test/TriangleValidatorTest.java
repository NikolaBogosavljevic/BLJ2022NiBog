package ch.noseryoung.test;

import ch.noseryoung.main.Triangle;
import ch.noseryoung.main.TriangleValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleValidatorTest {
    TriangleValidator tv;

    @BeforeEach
    public void setup(){
      tv = new TriangleValidator();
    }

    @Test
    public void isEquilateral_allSideSameLengths_true(){
        Triangle triangle = new Triangle(4, 4, 4);
        assertTrue(tv.isEquilateral(triangle));
    }

    @Test
    public void isIsosceles_twoSideSameLength_true(){
        Triangle triangle = new Triangle(2, 4, 4);
        assertTrue(tv.isIsosceles(triangle));
    }

    @Test
    public void isScalene_noSideSameLength_true(){
        Triangle triangle = new Triangle(2, 3, 5);
        assertTrue(tv.isScalene(triangle));
    }
}
