package Average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0; //счетчик последовательности
        int sum = 0;
        while (i <= 100) {
            int c = scanner.nextInt();
            if (c == 0) {
                break;
            } else {
                sum += c;
                i++;
            }
        }
        try {
            System.out.println(sum/i);
        } catch (Exception e) {
            System.out.println("Вы ввели ни одного числа");
        }

    }
}