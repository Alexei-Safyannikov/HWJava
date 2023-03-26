import java.util.ArrayList;

public class Task002 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(23);
        myList.add(56);
        myList.add(7);
        myList.add(98);
        int min = myList.get(0);
        int max = myList.get(0);
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < myList.size(); i++) {
            int current = myList.get(i);
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
            sum = sum + current;
        }
        avg = sum / myList.size();
        System.out.println("Минимальное значение в списке: " + min);
        System.out.println("Максимальное значение в списке: " + max);
        System.out.println("Среднее арифметическое значение в списке: " + avg);
    }
}