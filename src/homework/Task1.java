package homework;

import java.util.Scanner;

public class Task1 {

    //—оставить программу вывода любого числа любое заданное число раз.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите число");
        int number = sc.nextInt();
        System.out.println("—колько раз нужно вывести это число?");
        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            System.out.print(number + " ");
        }
    }
}
