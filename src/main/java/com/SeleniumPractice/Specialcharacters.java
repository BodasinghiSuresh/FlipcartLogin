package com.SeleniumPractice;

public class Specialcharacters {
	public  static void suresh() {
		String s = "p@ssword$123";
		String s1 = " ";
		System.out.println("original characters are ===" +s);
		System.out.println("special characters are ===");
		for(int i=0; i<=s.length(); i++) {
			char ch = s.charAt(i);
			if(isSpecialcharacter(ch)) {
				System.out.println(ch+" position is " +i);
			}
		}
		}
	
		public static  boolean isSpecialcharacter(char ch) {
			return !
			Character.isLetterOrDigit(ch)&&	!Character.isWhitespace(ch);	
		}
		public static void main(String[] args) {
			suresh();
		}
	}



