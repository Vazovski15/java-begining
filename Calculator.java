package calculator_test;

class Calculator {
    static int calculate(int a, int b, char op){
        switch (op){
            case '+':return a+b;
            case '-':return a-b;
            case '*':return a*b;
            case '/':return a/b;
            default:
                throw  new UnsupportedOperationException("Недопустимое значение");
        }
    }
}
