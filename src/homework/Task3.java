package homework;

public class Task3 {
    //Напечатать таблицу соответствия между весом в фунтах и
    // весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            double pounds = 1000.0 * i / 453;
            System.out.printf("%d кг = %f ф \n", i, pounds);
        }
    }
}
