package com.syntax.project01;

public class ProjectTask09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2, 15, 3500, 1, 80, 20 };
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		} 
   System.out.println(max);
}
}