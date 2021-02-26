package com.validemail;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDvalidationRTCL {

    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("atehClovis@domain.co.in");
        emails.add("atehClovis@domain.com");
        emails.add("atehClovis.name@domain.com");
        emails.add("atehClovis#@domain.co.in");
        emails.add("ateh'Clovis@domain.com");
        //Add invalid emails in list
        emails.add(".atehClovis@yahoo.com");
        emails.add("atehClovis@domain.com.");
        emails.add("atehClovis#domain.com");
        emails.add("atehClovis@domain..com");
        //Regular Expression
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        //Compile regular expression to get the pattern
         Pattern pattern = Pattern.compile(regex);
        //Iterate emails array list
        for(String email : emails){
            //Create instance of matcher
          Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}
