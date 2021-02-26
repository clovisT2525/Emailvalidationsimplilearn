package com.validemail;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDValidationRFC {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("atehClovis@domain.co.in");
        emails.add("12456@domain.com");
        emails.add("atehClovis.name@domain.com");
        emails.add("1tehClovis#@domain.co.in");
        //Add invalid emails in list
        emails.add("@yahoo.com");

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";


        Pattern pattern = Pattern.compile(regex);
        //Iterate emails array list
        for(String email : emails){
            //Create instance of matcher
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");

        }
    }
}
