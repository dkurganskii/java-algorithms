package algo;

import java.util.Arrays;
import java.util.List;
// O(n) time | O(1) space

public class ValidSubsequence {
    public static void main(String[] args) {
        List<Integer> array= Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sequence= Arrays.asList( 3, 5);
        System.out.println(isValidSubsequence(array, sequence));
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.size() && seqIdx < sequence.size()){
            if (array.get(arrIdx).equals(sequence.get(seqIdx))){
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }
}
