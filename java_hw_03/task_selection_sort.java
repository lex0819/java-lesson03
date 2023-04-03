package java_hw_03;
/*
Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это тзучить эти сортировки на Питоне , и постораться написать их на java)
*/

import java.util.*;

public class task_selection_sort {
    public static List<Integer> selection_sort(List<Integer> arr){
        int minimum = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++){
            minimum = i;
            for (int j = (i+1); j < arr.size(); j++) {
                // finding min
                if (arr.get(j) < arr.get(minimum)) {
                    minimum = j;
                }
            }
            // move min before sorted array
            temp = arr.get(minimum);
            arr.set(minimum, arr.get(i));
            arr.set(i, temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 15;
        List<Integer> numbers = new ArrayList<Integer>();
        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            numbers.add((ran.nextInt(1000)));
        }
        System.out.println(numbers);
        System.out.println(selection_sort(numbers));
    }
}