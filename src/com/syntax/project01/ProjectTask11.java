package com.syntax.project01;

public class ProjectTask11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array= {"Dog","Cat","Snake","Bird","Cat"};
		int i=0;
		int j=0;
		
		for(i=0; i<array.length; i++) {
			for(j=i+1; j<array.length; j++) {
				if(array[i].equals(array[j])) {
					System.out.println(array[i]);
					break;
				}
			}
		}
		
		
	}
