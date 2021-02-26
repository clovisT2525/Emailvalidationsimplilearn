package com.validemail;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDValidation {
    public static void main(String[] args) {

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("atehClovis@domain.co.in");
        emails.add("atehClovis@domain.com");
        emails.add("atehClovis#@domain.co.in");
        emails.add("atehClovis@domain.com");
        emails.add("atehClovis@domaincom");
        //Add invalid emails in list
        emails.add("@yahoo.com");
        emails.add("12atehClovis#domain.com");
        String regex =  "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile("regex");
        for (String email : emails) {

        Matcher matcher = pattern.matcher(email);
        System.out.println(email +" : "+ matcher.matches()+"\n");

        }
    }
}
