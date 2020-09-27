import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();
        System.out.println("Введите третье число: ");
        double z = in.nextDouble();

        double q = (x+y+z)/3;
        System.out.println("Среднее арифметическое трех чисел: " + q);
        double d = q/2;
        int result = (int)Math.floor(d);
        //System.out.println(result);
        if (result>3){
            System.out.println("Программа выполнена корректно");
        }

}
}
