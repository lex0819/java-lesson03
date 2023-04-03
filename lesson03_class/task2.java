package lesson03_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter how many items: ");
        int n = iScanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        for(int i = 0; i < n; i++){
            numbers.add(0);
        }
        numbers.add(1);
        System.out.println(numbers);

        System.out.print("Enter new position: ");
        int m = iScanner.nextInt();
        System.out.print("Enter new item: ");
        int x = iScanner.nextInt();

        numbers.add(m, x);
        System.out.println(numbers);

        iScanner.close();
    }
}

