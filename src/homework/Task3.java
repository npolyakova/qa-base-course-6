package homework;

public class Task3 {
    //���������� ������� ������������ ����� ����� � ������ �
    // ����� � ����������� ��� �������� 1, 2, ..., 10 ������ (1 ���� = 453 �).
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            double pounds = 1000.0 * i / 453;
            System.out.printf("%d �� = %f � \n", i, pounds);
        }
    }
}
