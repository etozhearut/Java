import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        double rate = in.nextDouble();
        System.out.println("Введите колличество рублей: ");
        int rub = in.nextInt();

        double convert = rub / rate;
        System.out.printf("Итого: %.2f долларов", convert);
    }
}
