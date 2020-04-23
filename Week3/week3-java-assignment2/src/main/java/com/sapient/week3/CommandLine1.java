package com.sapient.week3;

import java.util.Arrays;

public class CommandLine1 {

    private int []nums = null;
    private int max = 0;
    private int min = 0;
    private int sum = 0;
    private float avg = 0;

    public void setData(String []nums) {
        this.nums = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
    }

    public void calData() {
        if ( this.nums.length != 0 ) {
            for(int i = 0; i < this.nums.length; i++) {
                if( this.nums[i] > this.max) 
                    this.max = this.nums[i];
                
                if( this.nums[i] < this.min )
                    this.min = this.nums[i];
    
                this.sum += this.nums[i];
            }
    
            this.avg = (float)this.sum / this.nums.length;
        }
        
    }

    public void displayData() {
        System.out.println("Maximum : " + this.max);
        System.out.println("Minimum : " + this.min);
        System.out.println("Sum     : " + this.sum);
        System.out.println("Avegage : " + this.avg);
    }
}