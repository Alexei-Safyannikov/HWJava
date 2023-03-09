// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package Sem001;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;;

/**
 * Task001
 */
public class Task001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int number = scan.nextInt();
        scan.close();
        int[] arr = new int[number];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1,10);
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
            min = arr[j];
            }
            if (arr[j] > max) {
            max = arr[j];
            }
        }
        System.out.printf("Min = %s\n", min);
        System.out.printf("Max = %s\n", max);
    }

}