public class sumofdigit{
    public static void main(String[] args) {
        int x =604;
        int sum = 0;
        while(x!=0){
            int digit = x%10;
            sum+=digit;
            x/=10;
        }
        System.out.println(sum);
    }
}