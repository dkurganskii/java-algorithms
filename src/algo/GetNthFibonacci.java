package algo;


public class GetNthFibonacci {
    public static void main(String[] args) {
        System.out.println(getNthFib(4));
        System.out.println(getNthFibSecondSolution(4));
    }

    // O(log(n)) time | O(1) space
    public static int getNthFibSecondSolution(int n) {
        int[] lastTwo = {0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

    // O(log(2n)) time | O(n) space
    public static int getNthFib(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            return getNthFib(n - 1) + getNthFib(n - 2);

        }
    }
}
