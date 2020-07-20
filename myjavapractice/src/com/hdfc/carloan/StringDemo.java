package com.hdfc.carloan;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Tusar";
		String s2 = new String("Mamun");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.indexOf("T"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.contains("sa"));
		System.out.println(s2.contains("ma"));
		char a[] = s1.toCharArray();
		for (char c : a) {
			System.out.println(c);
		}
		// reversing of string
//	for(int i=s1.length()-1;i>=0;i--)
//	{
//		System.out.print(s1.charAt(i)+" ");
//	}
//	System.out.println();
//	
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.print(a[j] + " ");
		}
		System.out.println();

		String s3 = "I love My India";
		char b[] = s3.toCharArray();
		System.out.println(b);
		for (char w : b) {
			System.out.print(w + " ");
		}
		System.out.println(b.length);
		String a1[]=s3.split(" ");
		for (int i = a1.length - 1; i >= 0; i--) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for (int i = s3.length() - 1; i >= 0; i--) {
			System.out.print(s3.charAt(i));
		}
		System.out.println();

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}

}
