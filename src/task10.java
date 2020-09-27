import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Рядов: ");
        int rows = in.nextInt();
        System.out.print("Столбцов: ");
        int columns = in.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Введите элемент для строки номер %s, столбца номер %s: ", i+1, j+1);
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Полученная матрица:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Первая строка, умноженная на 3:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[0][i]*3);
        }
    }
}
