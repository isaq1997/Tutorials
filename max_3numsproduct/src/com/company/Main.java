package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int product(ArrayList<Integer> n) {
        int product = 1;
        for (int i : n) {
            product = product * i;
        }
        return product;
    }
    public static void main(String[] args) {
        int product = 1;
        int[] a = {3, 4, 9, 2, 78, 100, -100,-90};
        int[] min = new int[3];
        int[] max = new int[3];
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Arrays.sort(a);
        int h = 0;
        for (int i = 0; i < 3; i++) {
            min[i] = a[i];
            // System.out.println(min[i]);
        }
        for (int i = a.length - 3; i < a.length; i++) {
            max[i - a.length + 3] = a[i];
            //  System.out.println(max[i-a.length+3]);
        }
        if (Math.abs(min[0]) *Math.abs(min[1])>= Math.abs(max[0]) *Math.abs(max[1])
        &&max[2]>=0){
            nums.add(min[0]);
            nums.add(min[1]);
            nums.add(max[2]);
        }
        else
        {
            nums.add(max[0]);
            nums.add(max[1]);
            nums.add(max[2]);
        }
        int b = product(nums);
        System.out.println(b);
    }
}
