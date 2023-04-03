package java_hw_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task_merge_sort {
    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        return mergeSortInner(buffer1, buffer2, 0, sortArr.length);
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //sorted
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //merge
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    public static void main(String[] args) {

        int n = 15;
        List<Integer> numbers = new ArrayList<Integer>();
        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            numbers.add((ran.nextInt(1000)));
        }
        System.out.println(numbers);

        int[] sortArr = numbers.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(mergeSort(sortArr)));
    }
}