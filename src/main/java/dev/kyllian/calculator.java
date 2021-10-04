package dev.kyllian;

public class calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Bad number of argument");
            return;
        }
        int number1;
        int number2;
        try {
            number1 = Integer.parseInt(args[0]);
            number2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Bad arguments");
            return;
        }

        String operator = args[1];
        Integer result;
        switch (operator){
            case "+":
                result = Operator.addition(number1, number2);
                break;
            case "-":
                result = Operator.substraction(number1, number2);
                break;
            default:
                System.out.println("Bad operator");
                return;
        };
        System.out.println(result);
    }
}
