package Algoritms;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        for (int i = 100000; i <= 100000; i+= 100000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 100000);
            }
            int[] array2 = new int[array.length];
            for (int k = 0; k < array.length; k++) {
                array2[k] = array[k];
            }
            int[] array3 = new int[array.length];
            for (int m = 0; m < array.length; m++) {
                array3[m] = array[m];
            }

            Date startDate = new Date();
            QuickSort.sort(array);
            Date endDate = new Date();
            long QuickSortDuration = endDate.getTime() - startDate.getTime();

            Date startDate1 = new Date();
            MergeSort.sort(array2);
            Date endDate1 = new Date();
            long MergeSortDuration = endDate1.getTime() - startDate1.getTime();

            Date startDate2 = new Date();
            HeapSort.sort(array3);
            Date endDate2 = new Date();
            long HeapSortDuration = endDate2.getTime() - startDate2.getTime();

            System.out.printf("i: %s, QuickSort duration: %s, MergeSort duration: %s, HeapSort duration: %s%n", i, QuickSortDuration, MergeSortDuration, HeapSortDuration);

        }
    }
}
