import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число: ");
        int number = in.nextInt();
        int x = 7;
        int y = 3;
        int z = 0;
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах.");
        } else {
            System.out.println("Такой константы нет!");
        }
    }

}
