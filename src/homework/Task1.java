package homework;

import java.util.Scanner;

public class Task1 {

    //��������� ��������� ������ ������ ����� ����� �������� ����� ���.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� �����");
        int number = sc.nextInt();
        System.out.println("������� ��� ����� ������� ��� �����?");
        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            System.out.print(number + " ");
        }
    }
}
