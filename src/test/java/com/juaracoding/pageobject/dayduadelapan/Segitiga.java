package com.juaracoding.pageobject.dayduadelapan;

public class Segitiga {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 5;
		for (int i = count; i >= 1; i--) {
		  int temp = 0;
		  int j = count - i + 1;
		  while (temp != i) {
		    if (j % 2 != 0) {
		      if (!(i % 2 == 0 && temp >= i - 1)) {
		    	  System.out.print(j);
		      }
		      temp++;
		    } else {
		    	System.out.print("_");
		    }
		    j++;
		  }
		  System.out.println("");
		}


	}

}
