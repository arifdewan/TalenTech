package com.TalenTech.mahmub;

public class JavaCollections{

	public void ReverseArray() {
		int revArray[] = {8,4,1,9,6};
		
		int arrayLength = revArray.length;
		System.out.println("Lenth of the Array is: " + arrayLength);
		
		for (int i=0; i < arrayLength/2; i++) {
			int temp = revArray[i];
			revArray[i] = revArray[arrayLength-1-i];
			revArray[arrayLength-1-i] = temp;
		} // end of for i
		
		System.out.println("Reverse Array: /n" +revArray);
		
		for (int x=0; x < arrayLength-1;x++){
		System.out.println(revArray[x]);
		System.out.println();
		
		} // end of for x
		
					
		
		
	} // end of revArray
	
	public void ReverseString() {
		String s = "TalenTech";
		
		int sLength = s.length();
		 
		for (int i=sLength-1; i>=0; i--) {
			System.out.print(s.charAt(i));
			
		} // end of for i
	System.out.println();
	
		} // end of ReverseString
	
	
public void	EvenArray() {
	int num [] = {0,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
	int even = num.length;
	
	for (int i = 0; i < even+1; i ++) {
		if (num[i] %  2 == 0) {
			
			System.out.println(num[i]);
		}
	}
	System.out.println();
} // end of EvenArray

	public void	oddArray() {
	int num [] = {0,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
	int odd = num.length;
	
	for (int x = 0; x <= odd+1; x ++) {
		if ( num[x] %  2 != 0) {
			
			System.out.println("Odd Array: " + num[x]);
		}
	}
	System.out.println();
	
} // end of OddArray  

	
} // end of class
