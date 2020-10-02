import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = in.nextLine();
        int len1 = str1.length();
        System.out.print("Введите вторую строку: ");
        String str2 = in.nextLine();
        int len2 = str2.length();

        if (len1 > len2){
            System.out.println(str1);
        } else if(len1 < len2){
            System.out.println(str2);
        }else{
            System.out.println("Длины строк равны.");
        }
    }
}