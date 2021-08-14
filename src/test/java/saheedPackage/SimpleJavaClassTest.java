package saheedPackage;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleJavaClassTest {

    @Test
    public void additionTestClass(){
        SimpleJavaClass simpleJavaClass = new SimpleJavaClass();
        simpleJavaClass.additionMethod(3, 4);
        Assertions.assertEquals(7, simpleJavaClass.getSum());


    }
    @Test
    public void multiplicationTestClass(){
        SimpleJavaClass simpleJavaClass = new SimpleJavaClass();
        simpleJavaClass.multiplicationMethod(5, 21);
        Assertions.assertEquals("105", simpleJavaClass.getAnwser());
    }

    @Test
    public void divisionTest(){
        SimpleJavaClass simpleJavaClass = new SimpleJavaClass();
        simpleJavaClass.divisionMethod(12, 4);
        assertEquals(3, simpleJavaClass.getResult());
    }
    @Test
    public void subtractionTest(){
        SimpleJavaClass simpleJavaClass = new SimpleJavaClass();
        simpleJavaClass.subtractionMethod(69, 52);
        assertEquals(-17, simpleJavaClass.getSolution());
    }
}