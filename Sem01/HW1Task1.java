// Вычислить n-ое треугольного число(сумма чисел от 1 до n).

// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.



import java.util.Scanner;

public class HW1Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int res = 0;

        if (number < 1) {
            System.out.println("-1");
        } else {
            for (int i = 1; i <= number; i++) {
                res = res + i;
            }
        }
        System.out.println(res);
        inputScanner.close(); 
    }
}
