package me.valizadeh.practice.algorithm.sort;

import java.util.Comparator;

/**
 * @author :   Valizadeh, Ali
 */
public class BubbleSort<T> implements Sort<T> {

    @Override
    public T[] sort(T[] arr, Comparator<T> comparator) {
        for (int i = arr.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }

        }
        return arr;
    }
}
