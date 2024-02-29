// file1: TestCases.java
package test.java.com.example;
import com.example.NextDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
/**
 * Unit test for simple App.
 */
@Tag("Tests for NextDate method")

public class TestCases{

    @BeforeAll
    public static void shouldAnswerWithTrue() {
        System.out.println("Testing Starting.");
        ;
    }
    
    //Valid Test
    @Test
    public void test1() {
        assertEquals("13/6/2011", NextDate.NextDate(12, 6, 2011));
    }

    //Valid Test
    @Test
    public void test2() {
        assertEquals("12/5/2002", NextDate.NextDate(11, 5, 2002));
    }

    //Valid Test
    @Test
    public void test3() {
        assertEquals("22/2/2003", NextDate.NextDate(21, 2, 2003));
    }
    
    //Boundary Value Test
    @Test
    public void test4() {
        assertEquals("2/1/1812", NextDate.NextDate(1, 1, 1812));
    }

    //Boundary Value Test
    @Test
    public void test5() {
        assertEquals("1/1/2213", NextDate.NextDate(31, 12, 2212));
    }

    //Boundary Value Test
    @Test
    public void test6() {
        assertEquals("2/1/2001", NextDate.NextDate(1, 1, 2001));
    }

    //Boundary Value Test
    @Test
    public void test7() {
        assertEquals("1/1/2007", NextDate.NextDate(31, 12, 2006));
    }

    //Invalid Date Inputs Test
    @Test
    public void test8() {
        assertEquals("ERROR: out of range", NextDate.NextDate(34, 1, 2003));
    }

    //Invalid Date Inputs Test
    @Test
    public void test9() {
        assertEquals("ERROR: out of range", NextDate.NextDate(29, 2, 2021));
    }

    //Invalid Date Inputs Test
    @Test
    public void test10() {
        assertEquals("ERROR: out of range", NextDate.NextDate(1, 1, 1125));
    }

    //Leap Year Inputs test 
    @Test
    public void test11() {
        assertEquals("29/2/2024", NextDate.NextDate(28, 2, 2024));
    }

    //Leap Year Inputs test 
    @Test
    public void test12() {
        assertEquals("29/2/2012", NextDate.NextDate(28, 2, 2012));
    }

    //Leap Year Inputs test 
    @Test
    public void test13() {
        assertEquals("29/2/2016", NextDate.NextDate(28, 2, 2016));
    }
}
