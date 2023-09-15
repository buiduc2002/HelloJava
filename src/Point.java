import java.util.Scanner;

public class Point {
    public double x;
    public double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void Field() {
        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x > 0 && y < 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x < 0 && y > 0) {
            System.out.println(4);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x = scanner.nextDouble();
        Double y = scanner.nextDouble();
        Point point_M = new Point(x, y);
        System.out.println("Point M: " + point_M.toString());
           point_M.Field();

    }
}


    

