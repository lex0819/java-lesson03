package lesson03_class;

import java.util.*;

public class task3_sort_reverse {

    public static List<Integer> removeEvenItems(List<Integer> numbers){
        List<Integer> res = new ArrayList<>();

        for(Integer number: numbers){
            if (number % 2 != 0){
                res.add(number);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter how many items: ");
        int n = iScanner.nextInt();

        List<Integer> numbers = new ArrayList<Integer>();

        Random ran = new Random();

        for(int i = 0; i < n; i++){
            numbers.add((ran.nextInt(1000) - 1));
        }
        System.out.println(numbers);

        Integer[] num_arr = numbers.toArray(new Integer[0]);
        Arrays.sort(num_arr);
        for(int i = 0; i < n; i++){
            System.out.print(num_arr[i]+", ");
        }
        System.out.println();

        Arrays.sort(num_arr, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            System.out.print(num_arr[i]+", ");
        }
        System.out.println();

        int max = Collections.max(numbers);
        System.out.println("max is "+ max);

        int min = Collections.min(numbers);
        System.out.println("min is "+ min);

        double average01 = Arrays.stream(num_arr).reduce(0, (a, b) -> a + b) / num_arr.length;
        OptionalDouble average02 = numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println("average01 is "+ average01);
        System.out.println("average02 is "+ average02);

        System.out.println("show only odd items " + removeEvenItems(numbers));

        int mid = numbers.size() / 2;
        System.out.println(mid);
        List<Integer> left_sublist = new ArrayList<>(numbers.subList(0, mid));
        System.out.println(left_sublist);
        List<Integer> right_sublist = new ArrayList<>(numbers.subList(mid, numbers.size()));
        System.out.println(right_sublist);
    }
}