public class armstrong{
    public static void main(String[] args) {
        int n = 1630;
        int sum = 0;
        int original = n;
        while (n>0){
            int digit = n%10;
            sum = sum+(digit*digit*digit*digit);
            n=n/10;
        }
        if(original==sum){
            System.out.print("it is a armstrong number");
        }
        else 
          System.out.println("it is not a armstrong number");
    }
}