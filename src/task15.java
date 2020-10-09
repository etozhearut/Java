import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер масива: ");
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Элемент номер %d: ", i + 1);
            array[i] = in.nextInt();
        }
//        System.out.println("Полученный массив:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("%d ", array[i]);
//        }

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

            System.out.println("Отсортированный массив");
            for (int x = 0; x < array.length; x++) {
                System.out.printf("%d ", array[x]);
            }

    }
    }

