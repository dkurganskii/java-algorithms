package algo;

import java.util.Arrays;

// O(nlogn) time | O(1) space

public class MinimumWaitingTime {
    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);

        int totalWaitingTime = 0;
        for(int i = 0; i< queries.length; i++){
            int duration = queries[i];
            int queriesLeft = queries.length - (i +1);
            totalWaitingTime += duration * queriesLeft;
        }

        return totalWaitingTime;
    }

    public static void main(String[] args) {
        int [] arr = {4,2,2,1};
        System.out.println(minimumWaitingTime(arr));
    }
}
