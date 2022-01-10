package com.alogrithmproblems;

public class InsertionSortMain {
    public static void main(String args[]) {
        int arr[] = {-33, 15, 2, 17, 26};
        InsertionSort <Integer> ob = new InsertionSort();
        ob.sort(arr);
        ob.printArray(arr);
    }
}
