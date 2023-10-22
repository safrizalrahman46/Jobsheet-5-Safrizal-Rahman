import java.util.Scanner;

public class Selection322 {
    public static void main(String[] args) {
        double operand1, operand2, result; 
        char operator; 

        Scanner inputa22 = new Scanner(System.in); 
        System.out.println("input operand 1: "); 
        operand1 = inputa22.nextDouble();
        System.out.println("input operand 2: "); 
        operand2 = inputa22.nextDouble(); 
        System.out.println("input operator(+ - * /):"); 
        operator = inputa22.next().charAt(0); 

        switch(operator){ 
            case '+': result = operand1 + operand2; 
        System.out.println(operand1+" + "+operand2+" = "+result); 
        break; 
            case '-': result = operand1 - operand2; 
        System.out.println(operand1+" - "+operand2+" = "+result); 
        break; 
            case '*': result = operand1 * operand2; 
        System.out.println(operand1+" * "+operand2+" = "+result); 
        break; 
            case '/': result = operand1 / operand2;
        System.out.println(operand1+" / "+operand2+" = "+result); 
        break;
        }
    }
}
