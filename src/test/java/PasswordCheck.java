import java.util.Locale;

public class PasswordCheck {
    public static void main(String[] args) {

    }
/*
Q7. Write a return method that can verify if a password is valid or not.

requirements:

 1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false*/

    public static String passwordChecker(String pass){
     if(pass.length()>=6&&!pass.contains(" ")){
         if(!pass.toLowerCase().equals(pass)){  //Abc      abc
             if(!pass.toUpperCase().equals(pass)){
                 int count=0;
                 for(int i=0;i<pass.length();i++){

                     if(!Character.isAlphabetic(pass.charAt(i))&&!Character.isDigit(pass.charAt(i))){

                         break;

                     }
                 }



             }



         }
     }






        return "";

    }



}
