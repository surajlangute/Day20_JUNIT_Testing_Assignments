package day20Assignments;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import day20Assignment.UserRegistration;

public class UserRegistrationTest {
	@Test 
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
		UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Aniket");
      assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse(){
    	UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("An");
        assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenwithSpChars_ShouldReturnFalse(){
    	UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("An@agr");
        assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
    	UserRegistration validator = new UserRegistration();
        boolean result = validator.validateLastName("Agrawal");
        assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
    	UserRegistration validator = new UserRegistration();
        boolean result = validator.validateLastName("Ag");
        assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
    	UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNumber("9826887515");
        assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
    	UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNumber("98");
        assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
    	UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailAddress("ani@xyz.com");
        assertTrue(result);
    }


}

