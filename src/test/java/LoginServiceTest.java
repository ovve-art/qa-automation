import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginServiceTest {

    LoginService loginService;

    @BeforeEach
    void setUp(){

     loginService = new LoginService();

    }

    @Test
    void  accessGranted(){

        boolean actual = loginService.login("admin","12345");
        assertEquals(true,actual);

    }

    @Test
    void  wrongUsername(){

        boolean actual = loginService.login("admib","12345");
        assertEquals(false,actual);

    }

    @Test
    void  wrongPassword(){

        boolean actual = loginService.login("admin","12346");
        assertEquals(false,actual);

    }
}

