package com.syntax.project01;

public class ProjectTask04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int[][] num = { { 10, 12, 85, 36 }, { 51, 11, 52 }, { 100, 150, 165 } };
		     
		    for (int i = 0; i < num.length; i++) {
						for (int j = 0; j < num[i].length; j++) {
							if (num[i][j] % 2 == 0) {
								System.out.print(num[i][j] + " "); 
							}
						}
					}
	}
}

