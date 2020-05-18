package com.practice;

import java.util.ArrayList;

public class UserInput {

	public static class TextInput {
		ArrayList list = new ArrayList();

		public void add(char c) {

			list.add(c);
		}

		public String getValue() {

			return list.toString();
		}
	}
		public static class NumericInput extends TextInput {

			public void add(char c) {

				{
					if (Character.isDigit(c))
					list.add(c);			
					
				}
			}

		}

		public static void main(String[] args) {
			TextInput input = new NumericInput();
			input.add('1');
			input.add('a');
			input.add('0');
			System.out.println(input.getValue());
		}
	
}