/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10185819;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login {
    private String userName;
    private String passWord;
    private String name;
    private String surName;

    Scanner key = new Scanner(System.in);
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    
    public boolean checkUserName(String userName){
        if(userName.length()>=5 && userName.contains("_")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkPasswordComplexity(String passWord){//
        String regex = "^(?=.*[0-9])(?=.*[A-Z](?=.*[!@#&()_[{}]:;',?/~`$^+=<>])(8,20))";//(Stackoverflow;2019)(Delfstack;2020)
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passWord);
        
        if(matcher.matches())
            return true;
        
        else 
            return false;
    
        }
    /**
     * 
     * @param userName
     * @param passWord
     * @return 
     */
    public String registerUser(String userName, String passWord){
        String message = "";
        
        if (checkUserName(userName)==true && checkPasswordComplexity(passWord)==true ){
            message= "Username succesful, " + " Password succesful ";
        }
        
        if (checkPasswordComplexity(passWord)== true && checkUserName(userName)==false){
            message= " Password successful." + "Username is not correctly formatted, "
                    + "please ensure that your username contains an underscore and is no more than 5 characters in length ." ;
        }
        if (checkPasswordComplexity(passWord)==false && checkUserName(userName)== true ){
            message = " Password unsuccessful, password needs to contain 8 characters, capital letter, "
                    + "a number and a special character. " + " Username successful." ;
    }
        if (checkPasswordComplexity(passWord)==false && checkUserName(userName)==false ){
            message = " Password unsuccessful, password needs to contain 8 characters, capital letter, "
                    + "a number and a special character. " + " Username unsuccessful, ensure username has underscore "
                    + "and is more than 5 characters. ";
        }
        return message ;
}
    
        public boolean loginUser(String userName, String passWord){
           
           
            
            if (checkUserName(userName)==true && checkPasswordComplexity(passWord)==true)
                return true;
            else
                return false;
            
}
        public String returnLoginStatus(String userName, String passWord, String name, String surName){
            String message ="";
            if (loginUser(userName,passWord)==true){
            message = "Welcome "+ name +" , " + surName + " it is grest to see you again. ";
            }
            else {
                message = "Username or password incorrect, please try again ";
            }
            return message ;
        }
}
/*bibliography
Delftstack, 2019. Delftstack. [online]
availabele at : http://delftStack.com
[accessed 26 04 2022]
Stackflow, 2019. Stackflow. [online]
available at : http://stackflow.com
[accessed 26 04 2022].
*/