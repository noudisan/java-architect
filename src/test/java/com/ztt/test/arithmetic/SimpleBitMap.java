package com.ztt.test.arithmetic;

import java.util.BitSet;

public class SimpleBitMap {
	public static void main(String[] args) {
		  System.out.println("5<<3="+(5<<3));
		  System.out.println( Integer.toBinaryString(5<<3));
		  printBinary( Integer.toBinaryString(5<<3));
		  System.out.println(Integer.toBinaryString(-5));
	}
	
	public static void printBinary(String value){
		BitSet set = new BitSet();
		set.set(1);
		if(value.length()<32){
			StringBuffer sBuffer =new StringBuffer();
			for(int i=0;i<32-value.length();i++){
				sBuffer.append("0");
			}
			sBuffer.append(value);
			System.out.println(sBuffer);
		}
		
	}
}
