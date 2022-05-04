package com.bridgelabs.Basic;

public class Basicconcepts {
	
	public static void main(String[] args) {
	int i = 10; // 4 bytes
	int j;
	j = 20;
	System.out.println(i);
	System.out.println(j);

	i = 15;
	System.out.println(i);
	// x = 10 => x = 20 => x + y = 15; => x => 15 - x =>


	// ++ , --
	// x = 10;
	// x + 10; x = 10 => y = x + 10;
	// x ? 10 => x = x+10; => x =20
	// x = x + 14;
	i = 10;
	i = i + 1; // 11
	System.out.println(i);
	i += 1; // 12
	System.out.println(i);
	i = i + 1; // 13
	System.out.println(i);
	i += 10; // 23
	System.out.println(i);

	i++; // i = i + 1; increment operator // 24
	System.out.println(i);
	// System.out.println(i++); // equation
	// System.out.println(i);
	// i = 49
	i = i++ + i++; // => 24 + 25 = 49
	System.out.println(i);

	i = i++ + i++ + i++;
	System.out.println(i); // 150

	// increment => i++, ++i
	i++; // i = i + 1 // 151
	++i; // i = i + 1; // 152

	// i = i++ + i++; // 152 + 153
	i = ++i + ++i; //153 + 154 = 307
	System.out.println(i); // 307


	i = i++ + ++i + ++i; //307 + 309 + 310 =926
	System.out.println(i);

	i--;
	System.out.println(i); // 925

	i = i++ + i-- + --i;
	System.out.println(i); // 925 + 926 + 924

	boolean b = 13 > 12;
	System.out.println(b);
	b = 89 == 91;
	System.out.println(b);

	char ch = 'y';
	System.out.println(ch);

	String s = "abc";
	System.out.println(s);
	s = "abcde";
	System.out.println(s);
	
	int x = 10;
	int y = 20;
	boolean b1 = x == 10;// true
	System.out.println(b1);
	b1 = x == 20 && y == 20; // false && true
	System.out.println(b1);// false
	
	
	
	}
	}



