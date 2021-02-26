package com.validemail;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDvelaitionRNCTD {
    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("atehClovis@domain.co.in");
        emails.add("atehClovis@domain.com");
        emails.add("atehClovis.name@domain.com");
        emails.add("atehClovis#@domain.co.in");
        //Add invalid emails in list
        emails.add(".atehClovis@yahoo.com");
        emails.add("atehClovis@yahoo.com.");
        emails.add("atehClovis@yahoo..com");
        emails.add("atehClovis@yahoo.c");
        emails.add("atehClovis@yahoo.corporate");
        emails.add("ateh'Clovis@domain.com");
        //Regular Expression

        String regex =  "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";

        Pattern pattern = Pattern.compile(regex);
        for(String email : emails){

            Matcher matcher = pattern.matcher(email);
            System.out.println(email +":"+ matcher.matches()+"\n");
        }
    }
}
