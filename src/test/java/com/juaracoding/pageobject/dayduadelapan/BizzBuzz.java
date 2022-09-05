package com.juaracoding.pageobject.dayduadelapan;

public class BizzBuzz {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=100;i++) {
			
			if (i%5==0 && i%3==0) {
				System.out.println("BIZZBUZZ");
			} else if(i%3==0){
				System.out.println("BIZZ");
			} else if(i%5==0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(i);
			}
		}
	}

}
