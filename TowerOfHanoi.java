import java.util.*;

class Solution {
    public static void TowerOfHanoi(int n, int A, int B, int C) {
        if (n > 0) {
            TowerOfHanoi(n - 1, A, C, B);
            System.out.println("Move a disc from " + A + " to " +  C);
            TowerOfHanoi(n - 1, B, A, C);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 1;
        int B = 2;
        int C = 3;
        TowerOfHanoi(n, A, B, C);
    }
}