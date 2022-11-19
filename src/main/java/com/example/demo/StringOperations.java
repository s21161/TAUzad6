package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {

    public String reverse(String a) {
        if (a == null) {
            return null;
        }
        List<String> tempArray = new ArrayList<>();
        for (int i=0; i< a.length(); i++) {
            tempArray.add(a.substring(i, i+1));
        }
        StringBuilder reversedString = new StringBuilder();
        for (int i = tempArray.size()-1; i>=0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString.toString();
    }

    public String concat(String a, String b) {
        String retVal = null;
        if (a != null && a.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            if (b != null) {
                sb.append(b);
            }
            retVal = sb.toString();
        }
        return retVal;
    }
    public boolean isPalindrome(String a) {
        StringBuilder reversed = new StringBuilder(a).reverse();
        return reversed.toString().equals(a);
    }

}