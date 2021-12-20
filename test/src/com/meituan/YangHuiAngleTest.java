package com.meituan;

import java.util.Scanner;

/**
 * @Author: Qiipoint
 * @CreateTime: 12-20/2021 17:41
 * @Description:
 */
public class YangHuiAngleTest {
    public static void main(String[] args) {
        int[] reverseArray = new int[]{25, 13, 9, 6, 3, 37, 46, 74, 58};
        int i = 0;
        int j = reverseArray.length - 1;
        for (int k = 0; k < reverseArray.length / 2; k++, i++, j--) {
            reverseArray[i] = reverseArray[i] ^ reverseArray[j];
            reverseArray[j] = reverseArray[i] ^ reverseArray[j];
            reverseArray[i] = reverseArray[i] ^ reverseArray[j];
        }
        for (int m = 0; m < reverseArray.length; m++) {
            System.out.print(reverseArray[m] + "\t");
        }
    }
}
