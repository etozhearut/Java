import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер масива: ");
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Элемент номер %s: ", i + 1);
            array[i] = in.nextInt();
        }
        System.out.println("Полученный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("\nПолученный массив, где каждый элемент умножен на 2: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i] * 2);
        }
    }
}
