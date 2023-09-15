import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double interest = sc.nextDouble()/100;
        double month = sc.nextDouble();
        System.out.println(moneyTarget(money, interest, month));
        double target = sc.nextDouble();
        System.out.println(monthNumber(target,interest,money));
    }

    public static double moneyTarget(double n, double p, double m) {
        double target = n * Math.pow((1 + p), m);
        return target;
    }
    
     public static double monthNumber(double target, double p , double n) {
         double number = Math.log(target / n) / Math.log(1 + p);
        return number;
    }
}
