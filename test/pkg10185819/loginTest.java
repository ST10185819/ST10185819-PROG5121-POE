/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10185819;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
;import org.junit.Test;


/**
 *
 * @author lab_services_student
 */
public class loginTest {
    login tta = new login();

    @Test
    public void testCheckUserName() {
 
        boolean actualFalse = tta.checkUserName("kyle!!!!!!");
        assertFalse(actualFalse);
        
        
        boolean actualTrue = tta.checkUserName( "Kyl_1" );
        assertTrue(actualTrue );
        
    }

    @Test
    public void testCheckPasswordComplexity() {
        boolean actualTrue = tta.checkPasswordComplexity("Ch&&seec@ke99!");
        assertTrue(actualTrue);
        
        boolean actualFalse = tta.checkPasswordComplexity("password");
        assertFalse(actualFalse);
        
    }

    @Test
    public void testRegisterUser() {
        String actualMessages = tta.registerUser(" kyl_ " ," Ch&&seec@ke99! ");
        String expectedMessage = "Username succesful, " + " Password succesful ";
        assertEquals(expectedMessage,actualMessages);
        
        String actualMessage1 = tta.registerUser("kyl_","password");
        String expectedMessage1 = "Username succesful, " + " Password unsuccessful, password needs to contain 8 characters, capital letter";
        assertEquals(expectedMessage1, actualMessage1);
                }

    @Test
    public void testLoginUser() {
        tta.setUserName("kyl_");
        tta.setPassWord("Ch&&sec@ke99!");
        boolean actualTrue = tta.loginUser("kyl_","Ch&&sec@ke99!");
        assertTrue(actualTrue);
        
        boolean actualFalse1 = tta.loginUser("kyl_" ,"passwprd" );
        boolean actualFalse2 = tta.loginUser("kyle!!!!!", " Ch&&seec@ke99! ");
        boolean actualFalse3 = tta.loginUser("kyle!!!!!", "password" );
        assertFalse(actualFalse1);
                assertFalse(actualFalse2);
                 assertFalse(actualFalse3);
    }

    

}
