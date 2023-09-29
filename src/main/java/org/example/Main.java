package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] used = new boolean[n + 1];
        int[] permutation = new int[n];
        generatePermutations(n, permutation, used, 0);

    }

    public static void generatePermutations(int n, int[] permutation, boolean[] used, int index) {
        if (index == n) {
            for (int num : permutation) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    used[i] = true;
                    permutation[index] = i;
                    generatePermutations(n, permutation, used, index + 1);
                    used[i] = false;
                }
            }
        }
    }

}