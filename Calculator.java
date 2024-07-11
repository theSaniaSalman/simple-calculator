import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int op = scan.next().charAt(0);
        int result;

        if(op == '+'){
            result = a+b;
            System.out.println("sum: " + result);
        }
        else if(op == '-'){
            result = a-b;
            System.out.println("diff: " + result);
        }
        else if(op == '*'){
            result = a*b;
            System.out.println("multiplication: " + result);
        }
        else if(op == '/'){
            result = a/b;
            System.out.println("division: " + result);
        }
        else{
                result = a%b;
                System.out.println("modulo: " + result);
        }
        
    }
}