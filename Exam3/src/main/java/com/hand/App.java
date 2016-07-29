package com.hand;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入日期：");
        String s=input.next();
        String[] str=s.split("-");
//        for(int i=0;i<str.length;i++){
//        	System.out.println(str[i]);
//        }
        int year,month,day;
        int days=0;
        year=Integer.parseInt(str[0]);
        month=Integer.parseInt(str[1]);
        day=Integer.parseInt(str[2]);
        for(int i=1;i<month;i++){
        	switch(i){
        	   case 1:
        	   case 3:
        	   case 5:
        	   case 7:
        	   case 8:
        	   case 10:
        	   case 12:
        		   days=days+31;
        		   break;
        	   case 4:
        	   case 6:
        	   case 9:
        	   case 11:
        		   days=days+30;
        		   break;
        	   case 2:
        		   if((year%400==0)||(year%4==0&&year%100!=0)){
        			   days=days+29;
        		   }else
        			   days=days+28;
        		   
        		   
        	}
        }
        System.out.println("你输入的日期为当年的第"+(days+day)+"天");
        
    }
}
