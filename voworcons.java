import java.util.Scanner;
public class voworcons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch>='a'||ch<='z'){
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
            System.out.println("its a vowel");
        }
        else{
            System.out.println("its a consonant");
        }
        }
    }
}