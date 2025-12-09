package ru.mirea.uibo1.grachova.pr13;

import java.util.Arrays;
public class MergeSort {

    public static void mergeSort(Comparable[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        Comparable[] left = Arrays.copyOfRange(arr, 0, mid);
        Comparable[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(Comparable[] result, Comparable[] left, Comparable[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static Comparable[] mergeTwoListsAndSort(Comparable[] arr1, Comparable[] arr2) {
        Comparable[] merged = new Comparable[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);


        mergeSort(merged);
        return merged;
    }
}