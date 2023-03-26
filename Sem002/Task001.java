package Sem002;

import java.util.Scanner;

// 1. Напишите метод, 
// который принимает на вход строку (String) 
// и определяет является ли строка палиндромом 
// (возвращает boolean значение).

/**
 * Task001
 */
public class Task001 {

    public static void main(String[] args) {
        isPalindrome();
    }

    public boolean isPalindrome(String str) {
        // Scanner scan = new Scanner(System.in);
        // String palindrom = scan.nextLine();
        // System.out.println(palindrom);
        // scan.close();

        // Убираем пробелы и делаем все буквы строчными
        String palindrom = str.replaceAll(" ", "").toLowerCase();
        // Используем два указателя на начало и конец строки
        int i = 0;
        int j = palindrom.length() - 1;
        while (i < j) {
            // Если буквы не совпадают, то строка не является палиндромом
            if (palindrom.charAt(i) != palindrom.charAt(j)) {
                return false;
            }
            // Сдвигаем указатели
            i++;
            j--;
        }
        return true;
    }

}