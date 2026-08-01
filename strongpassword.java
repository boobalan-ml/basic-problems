import java.util.Scanner;
public class strongpassword{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = sc.nextLine();
        boolean up = false;
        boolean lo = false;
        boolean sp = false;
        boolean di = false;
        if(password.length()>=8){
            for(int i=0; i<=password.length()-1;i++){
                char ch = password.charAt(i);
                if(Character.isUpperCase(ch)){
                    up = true;
                }
                else if (Character.isLowerCase(ch)){
                    lo = true;
                }
                else if(Character.isDigit(ch)){
                    di = true;
                }
                else 
                     sp = true;
            }    
        }
        else{
            System.out.println("the password should length should be 8");
        }
        if(up && sp && lo && di ){
            System.out.println("the password is Strong");
        }
        else{
            System.out.println("the password is weak");
        }
    }
}