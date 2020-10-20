import java.util.Scanner;

    public class FinalTask1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число в бинарном формате: ");
            String binary = in.nextLine();
            int ten = 0;
            for (int i = binary.length() - 1, j = 1; i >= 0; i--, j *= 2) {
                ten += (binary.charAt(i) - '0') * j;
            }
            //int ten = Integer.parseInt(binary, 2);
            System.out.println("Число "+ binary + " в десятичном формате будет: " + ten );
        }
    }
