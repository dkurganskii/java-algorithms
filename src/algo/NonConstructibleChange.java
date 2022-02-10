package algo;

import java.util.Arrays;

class NonConstructibleChange {
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);

        int currentChangeCreated = 0;
        for(int coin : coins){
            if(coin > currentChangeCreated + 1){
                return currentChangeCreated + 1;
            }
            currentChangeCreated += coin;
        }
        return currentChangeCreated + 1;
    }

    public static void main(String[] args) {
        int[] input = new int[] {5, 7, 1, 1, 2, 3, 22};
        System.out.println(nonConstructibleChange(input));
    }
}
