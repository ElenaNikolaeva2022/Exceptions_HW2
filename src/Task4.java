// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
// (try быть не должно).

import java.util.*;
public class Task4 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            throw new NullPointerException("Пустые строки вводить нельзя!");
        }
        System.out.println("Вы ввели: " + input);
    }
}