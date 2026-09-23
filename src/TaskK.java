import java.util.Scanner;

public class TaskK {
    static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int totalMinutes = in.nextInt();

        int hours = (totalMinutes / 60) % 24;
        int minutes =  totalMinutes % 60;

        System.out.println(hours + " " + minutes );
    }
}
