package com;

import java.security.DomainCombiner;

public class Solution {
		public static void main(String[] args) {
			double[] marks = {98.1,87.2,45.6};
			
			//forward traversing
			for(int i =0;i<marks.length;i++){
				
				System.out.println(marks[i]);
			}
			
			//reverse traversing
			for(int i=marks.length-1;i>=0;i--) {
				
				System.out.println(marks[i]);
			}
		}
}
