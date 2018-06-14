package com.el.onboarding.junit.romanNumerals.services;

import java.util.TreeMap;

public class HinduToRomanNumeralConverter {

	public HinduToRomanNumeralConverter() {
		// TODO Auto-generated constructor stub
	
		
	}
	
    public String convert(int n) {

		String romanNum = "";
		
		while (n != 0) {
			if (n >= 1000) {
				romanNum = romanNum + "M";
				n = n-1000;
				continue;
			}
			else if (n >= 900){
				romanNum = romanNum + "CM";
				n = n-900;
				continue;
			}
			else if (n >= 500){
				romanNum = romanNum + "D";
				n = n-500;
				continue;
			}
			else if (n >= 400){
				romanNum = romanNum + "CD";
				n = n-400;
				continue;
			}
			else if (n >= 100){
				romanNum = romanNum + "C";
				n = n-100;
				continue;
			}
			else if (n >= 90){
				romanNum = romanNum + "XC";
				n = n-90;
				continue;
			}
			else if (n >= 50){
				romanNum = romanNum + "L";
				n = n-50;
				continue;
			}
			else if (n >= 40){
				romanNum = romanNum + "XL";
				n = n-40;
				continue;
			}
			else if (n >= 10){
				romanNum = romanNum + "X";
				n = n-10;
				continue;
			}
			else if (n >= 9){
				romanNum = romanNum + "IX";
				n = n-9;
				continue;
			}
			else if (n >= 5){
				romanNum = romanNum + "V";
				n = n-5;
				continue;
			}
			else if (n >= 4){
				romanNum = romanNum + "IV";
				n = n-4;
				continue;
			}
			else if(n >= 1){
				romanNum = romanNum + "I";
				n = n-1;
				continue;
			}
			
		}
		return romanNum;
	}

}
