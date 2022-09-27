import java.util.Scanner;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of radius");
        int r=sc.nextInt();
        System.out.println("Enter 1 for radius & 2 for circumference");
        int n=sc.nextInt();
        switch (n){
            case 1:
                area(r);
                break;
            case 2:
                circumference(r);
                break;
            default:
                break;
        }
    }
    public static void area(int r){
        double ans=3.14*r*r;
        System.out.println("Area of circle is:" + ans);
    }

    public static void circumference(int r){
        double ans=2*3.14*r;
        System.out.println("Circumference of circle is:" + ans);
    }
}