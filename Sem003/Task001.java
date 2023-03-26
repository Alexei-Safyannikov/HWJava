package Sem003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomList(10);
        System.out.println("Before: " + numbers);
        removeEvenNumbers(numbers);
        System.out.println("After: " + numbers);
    }

    public static List<Integer> generateRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static void removeEvenNumbers(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }
}