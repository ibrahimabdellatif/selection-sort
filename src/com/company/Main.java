package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {40, 33, 50, 41, 14, 12, 45, 15, 40, 65, 56, 87, 98, 89, 2, 1};
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int midIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[midIndex]) {
                    midIndex = j;
                }
            }
            //making swapping
            int temp = arr[midIndex];
            arr[midIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
