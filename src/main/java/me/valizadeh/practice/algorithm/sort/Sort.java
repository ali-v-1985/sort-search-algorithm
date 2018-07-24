package me.valizadeh.practice.algorithm.sort;

import java.util.Comparator;

/**
 * @author :   Valizadeh, Ali
 */
public interface Sort<T> {

    T[] sort(T[] arr, Comparator<T> comparator);
}
