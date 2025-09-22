import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter the first number : ");
            double a = sc.nextDouble();
            System.out.println("Enter the Second number : ");
            double b = sc.nextDouble();
            boolean op = true;
            while(op){
                System.out.println("Select the operation : +, -, *, /" );
                char ch = sc.next().charAt(0);
                if(ch != '+' && ch != '-' && ch != '*' && ch != '/'){
                    System.out.println("Enter the Valid Operation!!!");
                }
                else{
                    double result;
                    switch (ch){
                        case '+':
                            result = add(a, b);
                            if (result == (long) result) {
                                System.out.println("Result : " + (long) result);
                            } else {
                                System.out.println("Result : " + result);
                            }
                            break;
                        case '-':
                            result = sub(a, b);
                            if (result == (long) result) {
                                System.out.println("Result : " + (long) result);
                            } else {
                                System.out.println("Result : " + result);
                            }
                            break;
                        case '*':
                            result = mul(a, b);
                            if (result == (long) result) {
                                System.out.println("Result : " + (long) result);
                            } else {
                                System.out.println("Result : " + result);
                            }                            break;
                        case '/':
                            result = div(a, b);
                            if (result == (long) result) {
                                System.out.println("Result : " + (long) result);
                            } else {
                                System.out.println("Result : " + result);
                            }
                            break;
                    }
                    op = false;
                }
            }
            System.out.println("Do you want to do more math?? :- Y ? N");
            char con = sc.next().charAt(0);
            if(con == 'N' || con == 'n'){
                flag = false;
            }

        }
        System.out.println("Calculator Closed!!!");
    }
    public static double add(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double mul(double a, double b){
        return a * b;
    }

    public static double div(double a, double b){
        if(b == 0){
            System.out.println("Cannot Divide by Zero!!");
            return 01;
        }
        return (double) a / b;
    }
}


