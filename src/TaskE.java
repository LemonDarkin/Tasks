import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int t = sc.nextInt();

        int s = v * t;

        int result = s % 109;

        if (result < 0) {
            result += 109;
        }

        System.out.println(result);
    }
}