package Task_6;

public class Calculator {

    private double number1;
    private double number2;
    private char operation;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getAdd(double number1,double number2) {
        return number1 + number2;
    }

    public double getSubtract(double number1,double number2) {
        return number1 - number2;
    }

    public double getMultiply(double number1,double number2) {
        return number1 * number2;
    }

    public double getDivide(double number1,double number2) {
        if (number2 == 0) {
            System.out.println("Xəta: Sıfıra bölmə yoxdur");
            return 0;
        }
        return number1 / number2;
    }

    public double calculate() {
        switch (this.operation) {
            case '+':
                return getAdd(number1,number2);
            case '-':
                return getSubtract(number1,number2);
            case '*':
                return getMultiply(number1,number2);
            case '/':
                return getDivide(number1,number2);
            default:
                System.out.println("Yanlış əməliyyat simvolu");
                return 0;
        }
    }
}