package algo;

// O(log(n)) time, O(1) space

import java.util.Arrays;

public class TandemBicycle {
    public static int tandemBicycle(int[] redShirtSpeed, int[] blueShirtSpeed, boolean fastest){
        Arrays.sort(redShirtSpeed);
        Arrays.sort(blueShirtSpeed);

        if(!fastest){
            reverseArrayInPlace(redShirtSpeed);
        }

        int totalSpeed = 0;
        for (int idx = 0; idx< redShirtSpeed.length; idx++){
            int rider1 = redShirtSpeed[idx];
            int rider2 = blueShirtSpeed[blueShirtSpeed.length - idx -1];
            totalSpeed += Math.max(rider1, rider2);
        }
        return totalSpeed;
    }

    public static void reverseArrayInPlace(int[] array){
        int start = 0;
        int end = array.length-1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    public static void main(String[] args) {
        int[] redShirtSpeeds = {5,5,3,9,3};
        int[] blueShirtSpeeds = {3,6,7,2,1};
        boolean fastest = true;
        System.out.println(tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest));
    }
}
