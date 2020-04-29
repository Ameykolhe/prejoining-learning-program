package com.sapient.week4;

public class IntArrProcess {
	
	private int []arr;
	
	public IntArrProcess() {
		this.arr = new int[10];
	}
	
	
	public IntArrProcess(int n) {
		this.arr = new int[n];
	}
	
	
	public IntArrProcess(int []arr) {
		this.arr =	arr;
	}


	public IntArrProcess(IntArrProcess ref) {
		this.arr = new int[ref.arr.length];
		
		for (int i = 0; i < ref.arr.length; i++) {
			this.arr[i] = ref.arr[i];
		}
	}
	
	
	public void readData() {
		System.out.print("Enter " + this.arr.length + " Integers : ");
		for (int i = 0; i < this.arr.length; i++) {
			this.arr[i] = Util.sc.nextInt();
		}
	}
	
	
	public void displayHorizontal() {
		System.out.print("Array Content :");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(" " + this.arr[i]);
		}
		System.out.println();
	}
	
	
	public void displayVertical() {
		System.out.println("--------- Array Content --------");
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	
	
    public void sort() {
    	System.out.println("Sorting");
        for( int i = 1; i < this.arr.length; i++) {
            int num = this.arr[i];
            int j;

            for( j = i; j > 0 && this.arr[j - 1] > num; j--) {
                this.arr[j] = this.arr[j-1];
            }

            this.arr[j] = num;
        }
        
        this.displayHorizontal();
    }
    
	
	public void calcMinAndMax() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int num : this.arr) {
			if (num < min) {
				min = num;
			}
			else if (num > max) {
				max = num;
			}
		}
		
		System.out.println("Minimun : " + min);
		System.out.println("Maximum : " + max);
	}
	
	
	public void calcSum() {
		int sum = 0;
		
		for (int num : this.arr) {
			sum += num;
		}
		
		System.out.println("Sum : " + sum);
	}
	
	
	public void calcSecondBiggest() {
		int secondBiggest = Integer.MIN_VALUE;
		int biggest = Integer.MIN_VALUE;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] > biggest) {
				secondBiggest = biggest;
				biggest = this.arr[i];
			}
			else if (this.arr[i] > secondBiggest && this.arr[i] != biggest) {
				secondBiggest = this.arr[i];
			}
		}
		
		if (secondBiggest == Integer.MIN_VALUE) {
			System.out.println("Second Biggest no deosnt exist");
		} else {
			System.out.println("Second Biggest number : " + secondBiggest);
		}
	}
	
	
	public int[] getArr() {
		return arr;
	}
	
	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		
		if (!(o instanceof IntArrProcess)) { 
            return false; 
        }
		
		IntArrProcess obj = (IntArrProcess) o;
		
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] != obj.arr[i]) {
				return false;
			}
		}
		
		return true;

	}
	
	public void finalize() {
		this.arr = null;
	}
}
