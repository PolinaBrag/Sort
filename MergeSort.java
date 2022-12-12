package Algoritms;

public class MergeSort {
    
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    
    public static void sort(int[] array, int startPosition, int endPosition){
        if(startPosition == endPosition){
            return;
        }
        int midPosition = (startPosition + endPosition) / 2;
        sort(array, startPosition, midPosition);
        sort(array, midtPosition+1, endPosition);
        int[] buff = new int[array.length];
        int i = startPosition, j = midPosition+1, pos = startPosition;
        while(i <= midPosition && j <= endPosition){
            if(array[i] < array[j]){
                buff[pos] = array[i];
                i++;
                pos++;
            }else{
                buff[pos] = array[j];
                i++;
                pos++;
            }
        while(i <= midPosition){
            buff[pos] = array[i];
            i++;
            pos++;
        }
        while(i <= enddPosition){
            buff[pos] = array[j];
            i++;
            pos++;
        }
        for (int k = startPosition; k = endPosition; k++) {
            array[k] = buff[k];
        }
        }
    }
}
