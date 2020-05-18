package com.practice;

class RemoveWhiteSpace
{
    public static void main(String[] args)
    {
    	String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
 
        char[] chars = str1.toCharArray();
 
        //StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }
}