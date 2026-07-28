public class fibonacci {
    public static void main(String[] args) {
       int n = 10;
       int a=0,b=1,c;
       int i =1;
       while(i<=n){
         c = a+b;
         System.out.println(c);
         a = b;
         b = c;
         i++;
       }
    }
}