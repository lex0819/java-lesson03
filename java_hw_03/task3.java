package java_hw_03;
/*
* 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
* */

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        int n = 17; //length of the list

        List<Integer> numbers = new ArrayList<Integer>();

        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            numbers.add((ran.nextInt(100)));
        }
        System.out.println(numbers);

        int max = Collections.max(numbers);
        System.out.println("max is "+ max);

        int min = Collections.min(numbers);
        System.out.println("min is "+ min);

        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println("average is "+ average);
    }
}