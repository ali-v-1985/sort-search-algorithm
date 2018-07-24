package me.valizadeh.practice.algorithm.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;

/**
 * @author :   Valizadeh, Ali
 */
public class BubbleSort<T> implements Sort<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BubbleSort.class);


    @Override
    public T[] sort(T[] arr, Comparator<T> comparator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t1 : arr) {
            stringBuilder.append(t1).append(",");
        }
        stringBuilder.append("\r\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (comparator.compare(arr[j], arr[j - 1]) < 0) {
                    T swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                }
                for (T t1 : arr) {
                    stringBuilder.append(t1).append(",");
                }
                stringBuilder.append("\r\n");
            }

        }

        LOGGER.info(stringBuilder.toString());
        return arr;
    }
}
