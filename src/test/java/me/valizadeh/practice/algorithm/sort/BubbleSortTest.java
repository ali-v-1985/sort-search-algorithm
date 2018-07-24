package me.valizadeh.practice.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Comparator;

/**
 * @author :   Valizadeh, Ali
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class BubbleSortTest {


    /**
     * Tests first and last
     */
    @Test
    public void firstAndLast() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {10, 5, 6, 8, 3};
        Integer[] sortedArr = bubbleSort.sort(arr, (o1, o2) -> {
            if (o1 < o2) {
                return -1;
            } else if (o1.intValue() == o2) {
                return 0;
            } else {
                return 1;
            }
        });
        Assert.assertEquals(3, (int) sortedArr[0]);
        Assert.assertEquals(10, (int) sortedArr[sortedArr.length - 1]);
    }
}
