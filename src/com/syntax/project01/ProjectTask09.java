package com.syntax.project01;

public class ProjectTask09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {21,52,13,58,49,165,147};
		
		int max=array[0];
		int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)min=array[i];
			if(array[i]>max)max=array[i];
		}
		System.out.println("The smallest value in the array is "+min);
		System.out.println("The largest value in the array is "+max);
		
		
	}
