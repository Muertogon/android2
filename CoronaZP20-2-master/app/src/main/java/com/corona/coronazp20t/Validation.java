package com.corona.coronazp20t;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String USERNAME_REGEX_PATTERN="^[A-Za-z]{3,20}$";

    public static boolean isValidUsername(String username){
        Pattern pattern=Pattern.compile(USERNAME_REGEX_PATTERN);//Kuriamas sablonas pagal musu stringa
        Matcher matcher=pattern.matcher(username);//Palyginamas sablonas su vartotojo ivestais duomenimis

        return matcher.find();//Grazina true jeigu atitinka, false priesingu atveju
    }
    public static final String USERNAME_REGEX_PATTERN="^[A-Za-z]{5,20}[0-9]";

    public static final Pattern EMAIL_ADRESS =
}
