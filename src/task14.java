import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String str = in.nextLine();
        int num = Integer.parseInt(str);
        double dnum = (double)num;

        System.out.printf("Вы ввели  Конвертация в int  Конвертация в double  \n  %s             %d               %f", str, num, dnum);

    }
}