import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeServiceTest {

    AgeService ageService;

    @BeforeEach
    void setUp(){

        ageService = new AgeService();
    }

    @Test
    void adultUser(){
        boolean actual = ageService.isAdult(25);
        assertEquals(true, actual);
    }

    @Test
    void minoeUser(){
        boolean actual = ageService.isAdult(15);
        assertEquals(false,actual);
    }

    @Test
    void boundaryAge(){
        boolean actual = ageService.isAdult(18);
        assertEquals(true,actual);
    }
}
