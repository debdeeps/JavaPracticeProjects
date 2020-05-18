package com.Testdome;

public class UserInputTest {
	private static String value=new String();	//current value
    public static class TextInput {

    	
    	public void add(char c){
    		
    		if(value.length()==0){
    			value=Character.toString(c);
    		}else{
    			value+=c;
    		}
    		
    	}
    	public String getValue(){
    		return value;
    	}
    	
    }

    public static class NumericInput extends TextInput {
    	@Override
    	public void add(char c){
    		if(Character.isDigit(c)){
    			super.add(c);
    			//if character is numeric
//    			if(value.length()==0){
//        			value=Character.toString(c);
//        		}else{
//        			value+=c;
//        		}
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
