package edu.hakmandul;
/*
  @author   hakmandul
  @project   Laboratory2
  @class  Util
  @version  1.0.0 
  @since 2/15/2024 - 22.19
*/

public class Util {
    public static int convertRomanToArabic(String roman){

        if (roman == "") throw new IllegalArgumentException("String is empty");

        if (roman == null) throw new IllegalArgumentException("String isn't be null");

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'I':
                    result++;
                    break;
                case 'V':
                    if (result == 0 || roman.charAt(i-1) != 'I') {
                        result += 5;
                    } else {
                        result += 3; //
                    }
                    break;
                case 'X':
                    if (result == 0 || roman.charAt(i-1) != 'I') {
                        result += 10;
                    } else {
                        result += 8;
                    }
                    break;
                case 'L':
                    if (result == 0 || roman.charAt(i-1) != 'X') {
                        result += 50;
                    } else {
                        result += 30;
                    }
                    break;
                case 'C':
                    if (result == 0 || roman.charAt(i-1) != 'X') {
                        result += 100;
                    } else {
                        result += 80;
                    }
                    break;
                case 'D':
                    if (result == 0 || roman.charAt(i-1) != 'C') {
                        result += 500;
                    } else {
                        result += 300;
                    }
                    break;
                case 'M':
                    if (result == 0 || roman.charAt(i-1) != 'C') {
                        result += 1000;
                    } else {
                        result += 800;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Incorrect char in string");
            }
        }
        return result;
    }
}
