package Algoritms;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        for (int i = 10000; i <= 10000; i+= 10000) {
            int[] array = new int[i];
            for (int j = 0; index < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
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

            Date startDate = new Date();
            MergeSort.sort(array2);
            Date endDate = new Date();
            long MergeSortDuration = endDate.getTime() - startDate.getTime();

            Date startDate = new Date();
            HeapSort.sort(array3);
            Date endDate = new Date();
            long HeapSortDuration = endDate.getTime() - startDate.getTime();

            System.out.printf("i: %s, QuickSort duration: %s, MergeSort duration: %s, HeapSort duration: %s%n", i, QuickSortDuration, MergeSortDuration, HeapSortDuration);

        }
    }
}
