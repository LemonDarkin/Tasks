import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int a = v / 100;
        int d = (v/10)%10;
        int t = v % 10;
        int s = a + d + t;

        System.out.println(s);
    }
}
