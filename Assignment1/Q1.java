import java.util.Scanner;

public class Q1 {
        static String firstName = "Rajat";
        static String lastName = "Gupta";
        static int age = 22;
        private static void print(){
            System.out.println("In static method");
            System.out.println("Rajat Gupta 22");
        }
        public static void main(String[] args) {
            System.out.println("In main method");
            System.out.println(firstName + " " + lastName + " " + age);
            print();
        }
        static{
            System.out.println("In static block");
            System.out.println("Rajat Gupta 22");
        }
}
