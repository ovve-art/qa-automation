import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


public class FirstTest {

    int number;

    @BeforeEach
    void setUp(){
        number = 10;
    }

    @AfterEach
    void tearDown(){
        number = 0;
    }

    @Test
    void changeNumberTest(){
        number = 99;
        
        assertEquals(99, number);
    }

    @Test
    void defaultNumberTest(){
        assertEquals(10,number);
    }

    @Test
    void firstTest() {
       int expected = 200;
       int actual = 200;

       assertEquals(expected,actual);

    }
    @Test
    void adultTest(){
        int age = 25;

        assertTrue(age>18);
    }
    @Test
    void inactiveUserTest(){
        boolean active = false;

        assertFalse(active);
    }
    @Test
    void userNameTest(){
        String name = "Alex";

        assertNotNull(name);
    }
    @Test
    void discountTest(){
        int price = 100;
        int discount = 20;
        int expected = 80;

        int actual = price - price * discount / 100;

        assertEquals(expected,actual);
    }
}
