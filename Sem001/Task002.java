import java.util.Scanner;

// 2. Написать метод, который определяет, является ли год високосным,
//  и возвращает boolean (високосный - true, не високосный - false).
//  Каждый 4-й год является високосным, кроме каждого 100-го,
//  при этом каждый 400-й – високосный.


public class Task002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        scan.close();

       if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
        System.out.print(true);
       }
       else System.out.print(false);
    }
}
