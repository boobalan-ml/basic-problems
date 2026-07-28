public class countdigit {
    public static void main(String[] args) {
        int n = 34644389;
        int count = 0;
        int digit = 0;
        while(n!=0){
            digit = n%10;
            n=n/10;
            count+=1;
        }
       System.out.println(count);
    }
}