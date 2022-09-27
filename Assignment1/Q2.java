import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        StringBuilder ans=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        while (!str.equals("XDONE")){
            ans.append(str);
            ans.append(" ");
            str = sc.nextLine();
        }
        System.out.println(ans);
    }
}