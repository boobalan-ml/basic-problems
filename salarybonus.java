import java.util.Scanner;
public class salarybonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double bonus;
        if(salary>=50000){
           bonus = salary*0.20;
        }
        else {
            bonus = salary*0.10;
        }
        double totalsalary = bonus + salary;
        System.out.println(totalsalary);
    }
}