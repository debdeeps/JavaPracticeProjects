package com.practice;

//agoda problem
class Solution {
	public int solution(int N) {
//		// 111000000001000
		StringBuilder result = new StringBuilder();
		int no = 0;
		no = N;
		int count = 0;
		int i = 0;
		int max = 0;
		while (no > 0) {
			result.append(no % 2);
			i++;
			no = no / 2;
		}
		StringBuilder binarySB = result.reverse();
		String binary = binarySB.toString();
		System.out.println(binary);
//binary="100000";
		for (i = 0; i < binary.length() - 1; i++) {
			if (binary.charAt(i) == binary.charAt(i + 1) && binary.charAt(i) == '0') {
				count++;
				max = count;
			} else {
				count = 0;
//				max = count;
			}
		}
		return max + 1;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(32));
	}
}
