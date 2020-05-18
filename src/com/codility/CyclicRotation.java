/*
 A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

Write a function:

struct Results solution(int A[], int N, int K);

that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
package com.codility;

public class CyclicRotation {
	public static int[] solution(int[] A, int K) {
		// write your code in Java SE 8

		// Using the concept of "mod" (to make it cyclic)

		int[] new_array = new int[A.length]; // a new array

		for (int i = 0; i < A.length; i++) {
			int new_position = (i + K) % A.length; // using "mod" to do Cyclic Rotation
			new_array[new_position] = A[i]; // put A[i] to the new position
		}

		return new_array; // return new array

	}

	public static void main(String[] args) {
		int[] A = { 3, 8, 9, 7, 6 };
		
		int [] B= solution(A,1)		;	//new int[A.length];
		for (int i : B)
			System.out.println(i);
	}
}
