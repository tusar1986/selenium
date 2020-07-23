package com.hdfc.carloan;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "tusarkanti ";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		//touppercase & tolowercase
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		//length
		System.out.println(s1.length());
		//trim spaces
		System.out.println(s1.trim());
		System.out.println(s1);
		System.out.println(s1.length());
		//isempty
		System.out.println(s1.isEmpty());
		//charat
		System.out.println(s1.charAt(2));
		//indexof
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.substring(5, 10));//provide the ending index +1
		//System.out.println(s1.replace("tusar","tapas"));
		char a[]=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		String s2 = "biswal";
		System.out.println(s2);
		//hashcode
		System.out.println(s2.hashCode());
		//length
		System.out.println(s1.length());
		//isempty
		System.out.println(s1.isEmpty());
		//concat
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1.equals(s2));
		
		
		
		String s4=new String("Tusar");
		//equals
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s4.toLowerCase()));
		//equalsignorecase
		System.out.println(s1.equalsIgnoreCase(s2));
		//substring
		System.out.println(s1.substring(0, 5));
		//replace
		System.out.println(s1.replace(s1, "tapas"));
		//contains
		System.out.println(s1.contains("sa"));
		//startswith
		System.out.println(s1.startsWith("t"));
		//endswith
		System.out.println(s2.endsWith("s"));
		
		String s3 = "I love My India";
		System.out.println(s3.replace(' ','_'));
		System.out.println(s3);
//		System.out.println(s4);
		
//		
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
//		s4="mamun";
//		System.out.println(s4);
//		System.out.println(s4.hashCode());
//		System.out.println(s1.length());
//		System.out.println(s1.isEmpty());
//		System.out.println(s1.indexOf("T"));
//		System.out.println(s1.charAt(3));
//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.toUpperCase());
//		System.out.println(s1.contains("sa"));
//		System.out.println(s2.contains("ma"));
//		System.out.println(s1.equals(toLowerCase(s1)));
//		System.out.println(s1.equalsIgnoreCase(s3));
//		char a[] = s1.toCharArray();
//		for (char c : a) {
//			System.out.println(c);
//		}
//*************************************** reversing of string**************************************
//	for(int i=s1.length()-1;i>=0;i--)
//	{
//		System.out.print(s1.charAt(i)+" ");
//	}
//	System.out.println();
//	
//		for (int j = a.length - 1; j >= 0; j--) {
//			System.out.print(a[j] + " ");
//		}
//		System.out.println();
//
//		char b[] = s3.toCharArray();
//		System.out.println(b);
//		for (char w : b) {
//			System.out.print(w + " ");
//		}
//		System.out.println(b.length);
		
		
		String a1[] = s3.split(" ");
		
		for(String s:a1)
		{
			System.out.println(s+" ");
		}
		for (int i = a1.length - 1; i >= 0; i--) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();
//		System.out.println();
//		for (int i = s3.length() - 1; i >= 0; i--) {
//			System.out.print(s3.charAt(i));
//		}
//		System.out.println();
//
//		if (s1.equalsIgnoreCase(s2)) {
//			System.out.println("Strings are equal");
//		} else {
//			System.out.println("Strings are not equal");
//		}
		
		StringBuffer sf=new StringBuffer("Namrata");
		System.out.println(sf);
		System.out.println(sf.hashCode()); // 366712642
		
		StringBuffer sf1=new StringBuffer(" Panda");
		System.out.println(sf1);
		System.out.println(sf1.hashCode());
		
		sf=sf.append(sf1);
		System.out.println(sf.hashCode()); // hashCode does not change 366712642
		
		
		
	}
}
