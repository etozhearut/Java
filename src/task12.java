import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
        String str = in.nextLine();
        System.out.println(str.replaceAll("[\\s]+", ""));
    }
}