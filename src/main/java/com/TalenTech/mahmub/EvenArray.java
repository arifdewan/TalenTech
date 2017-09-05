package com.TalenTech.mahmub;

public class EvenArray {

	public static void main(String[] args) {
		int even1 = 0;
		int odd =0;
		int num [] = {0,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
		int even = num.length;
		
		for (int i = 0; i <even; i ++) {
			if (num[i] %  2 == 0) {
				
				System.out.println(num[i]+ " even num");
				even1++;
			}
			else 
				System.out.println(num[i]+ " is an od num");
			odd++;
	
		
		} // end of for i
		System.out.println("even = "+ even1 + "\nodd = " + odd);
	}

	}

