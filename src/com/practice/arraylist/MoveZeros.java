package com.practice.arraylist;

public class MoveZeros {
	
	public static void main(String[] args) {
		
		
		//Input: [0,1,0,3,12]
	    //Output: [1,3,12,0,0]
		
		int [] arr = {0,1,0,3,12};
		
		
		
		int k=0;
		for(int i : arr) {
			
			
			if(i!=0) {
				arr[k] = i;
				k++;
			}
		}
		for(int i=k;i<arr.length;i++) {
			arr[i] = 0;
		}
		
		
		
	}

}
