// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
// В этом задании не используем try catch.
// Пишем регулярное выражение и используем на строке метод matches.

import java.util.Scanner;

// public class Task1 {
//     static Scanner iScanner = new Scanner(System.in, "ibm866");
//     static String input;

//     public static void main(String[] args) {
//         System.out.println(inpFloat());
//     }

//     public static float inpFloat() {

//         System.out.println("Введите число c точкой: ");
//         input = iScanner.next();

//         while (!input.matches("[+-]?([0-9]*[.])?[0-9]+")) {
//             System.out.println("Неверный ввод. Введите число c точкой: ");
//             input = iScanner.next();
//         }
//         iScanner.close();
//         return Float.parseFloat(input);
//     }
// }

public class Task1 {
    // запрашивать у пользователя число типа float, пока не введет верный формат
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String floatPattern = "([+-]?(\\d+\\.)?\\d+)";
        while (!input.matches(floatPattern)) {
            System.out.println("Введен неверный формат " + input);
            input = scanner.nextLine();
        }

        float num = Float.parseFloat(input);
        System.out.println(num + 1);
    }
}

