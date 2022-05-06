package com.bridgelabs.Basic;

import java.util.Arrays;
import java.util.Scanner;

// 1-D Array x
public class BasicConcept3 {
public static void main(String[] args) {
/**
* 1,2,3,4
* 1,2,3,4
* 1,2,3,4
*/
// Array -> while declaration of varaible we need specify the size
System.out.println("Enter the count of number : ");
Scanner scanner = new Scanner(System.in);
int size = scanner.nextInt();
int[] values = new int[size]; // 4

// 10 = 10 + 5
for (int i = 0; i <= size - 1; i++) {
System.out.println("Enter " + (i + 1) + " number : ");
values[i] = scanner.nextInt();
}

// we have to calculate the sum of that numbers

// for-each loop
// 1 2 3 4 5 = 3 + 3 4 5 => 6 + 4 5 = 10 + 5 = 15
int sum = 1; // 15
for (int i = 0; i <= values.length -1 ; i++) {
sum = sum * values[i];
/**
*
*/
}
System.out.println(sum);

int sumForEach = 0;
// 1 2 3 4 5
// it will directly fetch the value from the without help of index, but in sequencial order-> 0, 1,2, 3...
for (int i : values) {
sumForEach += i;
}
}
}