package com.myjotter.jotter;

public class jotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    if (check(3)) {
    	System.out.println("true");
    }else {
    	System.out.println("true");
    }

	}
	
	public static boolean check(int i) {
		boolean results = false;
		int count = 0;
	
			for(int j=i;j>=1;j--) {
				
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				results = true;
			}
			return results;
	}
	

}
