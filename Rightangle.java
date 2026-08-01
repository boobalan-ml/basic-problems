import java.util.Scanner;
public class Rightangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for a,b,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a,Math.max(b,c));
        if(max == a){
            if(a*a==b*b+c*c){
                System.out.println("It is right angle traingle");
            }
            else{
                System.out.println("It is Not right angle traingle");
            }
        }
        else if(max == b){
            if(b*b == a*a+b*b){
                System.out.println("It is a right angle");
            }
            else{
                System.out.println("It is not a right angle");
            }
        }
        else{
            if(c*c == b*b+a*a){
                System.out.println("It is a right angle");
            }
            else{
                System.out.println("It is not a right angle");
            }
        }
    }
}