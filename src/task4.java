import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String binary = in.nextLine();
        int ten = Integer.parseInt(binary, 2);
        System.out.println("Число "+ binary + " в десятичном формате будет: " + ten);
    }
}
