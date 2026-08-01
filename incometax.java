import java.util.Scanner;
class incometax {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double income = sc.nextDouble();
            double tax;
            if(income<= 250000){
                tax = 0 ;
                System.out.println("tax = "+tax);
            }
            else if(income>250000 && income<=500000){
                 tax = (income-250000)*0.05;            
                 System.out.println(tax);
            }
            else if(income>500000 && income<=1000000){
                  tax =12500+(income-500000)*0.20;
                  System.out.println(tax);
            }
            else{
                tax = 112500+(income-1000000)*0.30;
                System.out.println(tax);
            }
    }
}