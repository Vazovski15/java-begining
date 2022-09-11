package calculator_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input= sc.nextLine();
        System.out.println(calc(input));


    }


    public static String calc(String input){
        String[] strings = input.split(" ");


        if (strings.length<=2){
            throw new IllegalArgumentException("Строка не является математической операцией");
        }

        if (strings.length !=3|| strings[1].length() > 1){
            throw new IllegalArgumentException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        String a= strings[0];
        String b = strings[2];
        char op = strings[1].charAt(0);

        if (!(conversion.isNumber(a)&&conversion.isNumber(b)&&conversion.matOper(op))){;
        throw new IllegalArgumentException("строка не является математической операцией");}

        if (conversion.isRomanNumber(a)&&conversion.isRomanNumber(b)){
            int arabicA = conversion.romanToArabic(a);
            int arabicB = conversion.romanToArabic(b);
            int result =Calculator.calculate(arabicA,arabicB,op);

            if (result<0){
                throw new IllegalArgumentException("В римской системе нет отрицательных числе");
            }else if (result==0){
                throw new IllegalArgumentException("В римской системе нет 0 ");
            }
            return conversion.arabicToRoman(result);
        }
        else if (conversion.isArabicNumber(a)&&conversion.isArabicNumber(b)){
            int aArabic= Integer.parseInt(a);
            int bArabic = Integer.parseInt(b);
            int result = Calculator.calculate(aArabic,bArabic,op);
            return String.valueOf(result);
        }
        else {
            throw new IllegalArgumentException("используются одновременно разные системы счисления");
        }
    }

}
