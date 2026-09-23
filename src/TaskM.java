import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int g = a;
        a = b;
        b = g;

        System.out.println(a + " " + b);
    }
}
