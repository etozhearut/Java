import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double number1 = in.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = in.nextDouble();
        System.out.println("Введите третье число: ");
        double number3 = in.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("Среднее арифметическое трех чисел: " + average);
        double halfAv = average / 2;
        int result = (int)Math.floor(halfAv);
        //System.out.println(result);
        if (result > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
