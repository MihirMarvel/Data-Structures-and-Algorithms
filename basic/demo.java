package basic; //Use folder name as package name
import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Hey Mihir "+x);
        scanner.close();
    }
}