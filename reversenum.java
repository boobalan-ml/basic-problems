public class reversenum{
    public static void main(String[] args) {
        int n = 654321;
        int reverse = 0;
        int digit;
        while(n!=0){
            digit = n%10;
            reverse = reverse*10+digit;
            n = n/10;
        }
        System.out.println(reverse);
    }
}