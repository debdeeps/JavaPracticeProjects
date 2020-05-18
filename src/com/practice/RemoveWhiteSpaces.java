package com.practice;

class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str1 = "Saket Saurav        is a QualityAna    list";
 
        //1. Using replaceAll() Method
 
         str1 = str1.replaceAll(" ", "");
 
        System.out.println(str1);
 
           }
}
