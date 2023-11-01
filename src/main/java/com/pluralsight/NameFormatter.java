package com.pluralsight;

public class NameFormatter {
    private String prefix;
    private String firstName;

    private String middleName;

    private String lastName;

    private String suffix;

    private NameFormatter(){

    }

    public static String format(String firstName, String lastName){

        return firstName + lastName;

    }


    public static String format (String prefix, String firstName, String middleName, String lastName, String suffix){

        return prefix + firstName + middleName + lastName +","+ suffix;
    }

    public static String format (String fullName){

        return fullName;

    }




}


