import java.util.Scanner;
public class quadratic {
    public static void main(String[] args) {
      System.out.println("enter value for a,b,c");
      Scanner sc = new Scanner(System.in);
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      double d = b*b-4*a*c;
      if(d==0){
        double root;
        root = -b/(2*a);
        System.out.println(root);
      }
      else if(d>0){
          double root_1 = (-b - Math.sqrt(d))/2*a;
          double root_2 = (-b + Math.sqrt(d))/2*a;
          System.out.println(root_1);
          System.out.println(root_2);
      }
      else{
        System.out.println("imaginary roots");
      }
      sc.close();
    }
}