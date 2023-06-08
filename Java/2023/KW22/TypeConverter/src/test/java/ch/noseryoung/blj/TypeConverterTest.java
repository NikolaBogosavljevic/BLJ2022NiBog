package ch.noseryoung.blj;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class TypeConverterTest {

    TypeConverter tc;

    @BeforeEach
    public void setUp(){
        tc = new TypeConverter();
    }


    @Test
    @Description("Description: Tests if the String to short convertor works.")
    public void converterStringToShortTestPass() {
        Assertions.assertEquals(10000, tc.convertStringToShort("10'000"));
    }

    @Test
    public void converterStringToShortFail() {
        // Assertions.assertEquals();
    }

    @Test
    @Description("Description: Tests if the String to double convertor works.")
    public void converterStringToDoubleTestPass() {
        Assertions.assertEquals(323323.14, tc.convertStringToDouble("323323.14"));
    }

    @Test
    @Description("")
    public void converterStringToLongTestPass() {
        Assertions.assertEquals(15, tc.convertStringToLong("15"));
    }

    @Test
    public void stringToCharArrayTest() {
        char[] charArray = {'k', 'o', 'n', 'n'};
        Assertions.assertArrayEquals(charArray, tc.StringToCharArray("konn"));
    }

    @Test
    public void stringToCharSetTest() {
        HashSet<Character> charSet = new HashSet<>();
        charSet.add('b');
        charSet.add('o');
        charSet.add('o');
        charSet.add('l');
        charSet.add('a');
        charSet.add('a');
        charSet.add('n');
        Assertions.assertEquals(charSet, tc.StringToCharSet("boolaan"));
    }
}
