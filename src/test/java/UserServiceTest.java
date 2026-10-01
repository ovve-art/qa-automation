import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    UserService userService;


    @BeforeEach
    void setUp(){

        userService = new UserService();
    }

    @Test
    void adultUser(){
        boolean actual = userService.isAdult(25);

        assertTrue(actual);
    }

    @Test
    void minorUser(){
        boolean actual = userService.isAdult(15);

        assertFalse(actual);
    }

    @Test
    void boundaryAge(){
        boolean actual = userService.isAdult(18);

        assertTrue(actual);
    }

    @Test
    void successfulLogin(){
        boolean actual = userService.canLogin("admin","12345");

        assertTrue(actual);
    }

    @Test
    void wrongLogin(){
        boolean actual = userService.canLogin("admi4","123545");

        assertFalse(actual);
    }

    @Test
    void adminRole(){

        String actual = userService.getRole(true) ;

        assertEquals("ADMIN", actual);
    }

    @Test
    void regularUserRole(){

        String actual = userService.getRole(false);

        assertEquals("USER", actual);
    }
}
