import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("enter the operation to perform");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
               System.out.println("add = "+(a+b));
               break;
            case '-':
               System.out.println("sub = "+(a-b));
               break;
            case '*':
               System.out.println("mul = "+(a*b));
               break;
            case '/':
              if(a!=0){
              System.out.println("div = "+(a/b));
              break;
              }
            case '%':
            if(a!=0){
            System.out.println("div = "+(a%b));
            break;
            }
        }
    }
}