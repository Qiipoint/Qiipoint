package com.meituan;

import java.util.Arrays;

/**
 * @Author: Qiipoint
 * @CreateTime: 12-20/2021 19:59
 * @Description:
 */
public class BubbleSortTest {

    public static void swap(int[] source, int a, int b) {
        source[a - 1] = source[a - 1] ^ source[b - 1];
        source[b - 1] = source[a - 1] ^ source[b - 1];
        source[a - 1] = source[a - 1] ^ source[b - 1];
    }

    public static void bubbleSort(int[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length -i - 1; j++) {
                if (source[j + 1] < source[j]) {
                    swap(source, j + 1, j + 2);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] targetArray = new int[] {23, 25, 27, 38, 5, 57, 48, 9, 87, 79, 92, 89};
        System.out.println("排序前：" + Arrays.toString(targetArray));
        bubbleSort(targetArray);
        System.out.println("排序后：" + Arrays.toString(targetArray));
    }
}
