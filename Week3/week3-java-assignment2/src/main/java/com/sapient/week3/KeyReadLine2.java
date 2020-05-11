package com.sapient.week3;

import java.util.Arrays;

public class KeyReadLine2 {

    private int []nums = null;

    public void read(String input) {
        this.nums = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }


    public void sort() {
        System.out.println("Sorting");
        for( int i = 1; i < this.nums.length; i++) {
            int num = this.nums[i];
            int j;

            for( j = i; j > 0 && this.nums[j - 1] > num; j--) {
                this.nums[j] = this.nums[j-1];
            }

            this.nums[j] = num;
        }
    }


    public void search(int key) {
        int l = 0, r = this.nums.length - 1;

        boolean flag = false;
        while(l <= r) {
            int mid = ( l + r ) / 2;

            if(this.nums[mid] == key) {
                System.out.println(String.format("Found %d at index %d", key, mid));
                flag = true;
                break;
            }

            else if(this.nums[mid] < key) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        if(!flag) {
            System.out.println(String.format("Number %d is not present in Array", key));
        }
    }


    public void display() {
        System.out.println("Content of Array is : " + Arrays.toString(this.nums));
    }
}