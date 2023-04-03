package java_hw_03;
/*
 * 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

import java.util.*;

public class task2 {
    public static List<Integer> removeEvenNumbers(List<Integer> numbers){
        List<Integer> res = new ArrayList<>();

        for(Integer number: numbers){
            if (number % 2 != 0){
                res.add(number);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 17; //length of the list

        List<Integer> numbers = new ArrayList<Integer>();

        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            numbers.add((ran.nextInt(100)));
        }
        System.out.println(numbers);
        System.out.println("show only odd items " + removeEvenNumbers(numbers));
    }
}