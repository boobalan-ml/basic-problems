import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 System.out.print("Enter a Character : ");
                 char a = sc.next().charAt(0);
                 if(a>='a' && a<='z'){
                    System.out.println("it is a lowercase");
                 }
                 else if(a>='0'&&a<='9'){
                    System.out.println("It is a digit");
                 }
                 else if(a>='A'&& a<='Z'){
                    System.out.println("It is a uppercase");
                 }
                 else{
                    System.out.println("It is a special character");
                 }
    }
}