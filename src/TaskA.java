import java.util.Scanner; //Подключаем Scanner — он нужен, чтобы считывать данные с клавиатуры.

public class TaskA {             //Создаём класс с названием Main

    public static void main(String[] args) {    //Это главная функция программы. Именно отсюда начинается выполнение кода.


        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double c = Math.sqrt(a*a + b*b );
        System.out.println(c);
    }
}