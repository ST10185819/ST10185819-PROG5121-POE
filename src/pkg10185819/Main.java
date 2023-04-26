/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10185819;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       Scanner key = new Scanner (System.in);
     login login = new login();
     
     String userName;
     String passWord;
     String name;
     String surName;
     
     System.out.println(" Logins will be asked twice for safety reasons ");
     System.out.println(" Create Username ");
     System.out.println(" Must contain underscore, and be 5 characters ");
     userName = key.nextLine();
     
     System.out.println(" Enter password ");
     System.out.println("Must contain 8 characters , Captital letter, Specail character and number");
     passWord= key.nextLine();
     
     System.out.println(login.registerUser(userName, passWord));
     
     System.out.println(" Enter name: ");
     name= key.nextLine();
     
     System.out.println("Enter Surname: ");
     surName = key.nextLine();
          
     login.setName(name);
     login.setSurName(surName);
     login.setUserName(userName);
     login.setPassWord(passWord);
     
     login.checkUserName(userName);
     login.checkPasswordComplexity(passWord);
     
   System.out.println(login.registerUser(userName, passWord));
  
     System.out.println(login.returnLoginStatus(userName, passWord, name, surName));
     
    }
  
}
