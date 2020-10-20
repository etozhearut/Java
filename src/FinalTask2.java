import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер масива: ");
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Элемент номер %s: ", i + 1);
            arr[i] = in.nextInt();
        }
        System.out.println("Полученный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        int temp, j;
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        System.out.println("Отсортированный массив");
        for (int x = 0; x < arr.length; x++) {
            System.out.printf("%d ", arr[x]);
        }

    }
}