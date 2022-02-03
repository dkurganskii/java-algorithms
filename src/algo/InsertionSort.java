package algo;

import java.util.Arrays;

// O(n^2) time, O(1) space

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        if(array.length == 0){
            return new int[] {};
        }
        for(int i = 1; i < array.length; i++){
            int j = i;
            while(j > 0 && array[j] < array[j-1]){
                swap(j, j-1, array);
                j -= 1;
            }
        }
        return array;
    }

    public static void swap(int i, int j, int[]array){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
        int[]array = {3,2,4};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
