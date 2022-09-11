package calculator_test;

import java.io.IOException;

class conversion {
    static boolean matOper(char op){

        return op =='+'||op=='-'||op=='*'||op=='/';
    }

    static int romanToArabic(String number){
    switch (number){
        case "I":return 1;
        case "II": return 2;
        case "III":return 3;
        case "IV":return 4;
        case "V":return 5;
        case "VI":return 6;
        case "VII":return 7;
        case "VIII":return 8;
        case "IX":return 9;
        case "X":return 10;
        default:
            throw new IllegalArgumentException("Недопустимое значение");
    }
    }




    static String arabicToRoman(int arabic){
        int h = arabic / 100;
        int t = (arabic / 10) % 10;
        int o = arabic % 10;

        String hundredsRoman = "";
        String tensRoman = "";
        String unitRoman = "";

        switch (h) {
            case 0:
                hundredsRoman = "";
                break;
            case 1:
                hundredsRoman = "C";
                break;
        }

        switch (t){
            case 0: tensRoman="";
                 break;
            case 1:
                tensRoman = "X";
                break;
            case 2:
                tensRoman = "XX";
                break;
            case 3:
                tensRoman = "XXX";
                break;
            case 4:
                tensRoman = "XL";
                break;
            case 5:
                tensRoman = "L";
                break;
            case 6:
                tensRoman = "LX";
                break;
            case 7:
                tensRoman = "LXX";
                break;
            case 8:
                tensRoman = "LXXX";
                break;
            case 9:
                tensRoman = "XC";
                break;

        }
        switch (o) {
            case 0:
                unitRoman = "";
                break;
            case 1:
                unitRoman = "I";
                break;
            case 2:
                unitRoman = "II";
                break;
            case 3:
                unitRoman = "III";
                break;
            case 4:
                unitRoman = "IV";
                break;
            case 5:
                unitRoman = "V";
                break;
            case 6:
                unitRoman = "VI";
                break;
            case 7:
                unitRoman = "VII";
                break;
            case 8:
                unitRoman = "VIII";
                break;
            case 9:
                unitRoman = "IX";
                break;
        }
        return hundredsRoman+tensRoman+unitRoman;
    }
    static boolean isRomanNumber(String number){
        return number.matches("I|II|III|IV|V|VI|VII|VIII|IX|X");
    }

    static boolean isArabicNumber(String number){
        return number.matches("1|2|3|4|5|6|7|8|9|10|}");
    }

    static boolean isNumber(String number){
        return  isRomanNumber(number) || isArabicNumber(number);
    }
}