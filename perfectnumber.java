public class perfectnumber {
    public static void main(String[] args) {
        int sum =0;
        int n = 6;
        for(int i=1;i<=n/2;i++){
            if(n%2==0){
                sum = sum+i;
            }
        }
          if(sum==n){
                System.out.println("it is a perfect number");
            }
            else 
            System.out.println("it is not a perfect number");
        }
    }