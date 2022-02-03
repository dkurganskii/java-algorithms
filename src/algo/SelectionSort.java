package algo;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int startIdx = 0;
        while(startIdx < array.length -1){
            int smallestIdx = startIdx;
            for(int i = startIdx +1; i< array.length; i++){
                if(array[smallestIdx] > array[i]){
                    smallestIdx = i;
                }
            }
            int temp = array[smallestIdx];
            array[smallestIdx] = array[startIdx];
            array[startIdx] = temp;
            startIdx++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
