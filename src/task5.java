import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        int q = num *2;
        int w = num *3;
        int e = num *4;
        int r = num *5;
        int t = num *6;
        int y = num *7;
        int u = num *8;
        int i = num *9;
        int o = num *10;
        System.out.println(num + " * 1 = " + num);
        System.out.println(num + " * 2 = " + q);
        System.out.println(num + " * 3 = " + w);
        System.out.println(num + " * 4 = " + e);
        System.out.println(num + " * 5 = " + r);
        System.out.println(num + " * 6 = " + t);
        System.out.println(num + " * 7 = " + y);
        System.out.println(num + " * 8 = " + u);
        System.out.println(num + " * 9 = " + i);
        System.out.println(num + " * 10 = " + o);

        //другой вариант решения задачи
        //System.out.printf("%s x 1 = %s\n%s x 2 = %s\n%s x 3 = %s\n%s x 4 = %s\n%s x 5 = %s\n%s x 6 = %s\n%s x 7 = %s\n%s x 8 = %s\n%s x 9 = %s\n%s x 10 = %s\n", num, num, num, num*2, num, num*3, num, num*4, num, num*5, num, num*6, num, num*7, num, num*8, num, num*9, num, num*10);
    }
}
