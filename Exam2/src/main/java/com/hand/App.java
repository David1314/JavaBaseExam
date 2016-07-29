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
        Scanner input = new Scanner(System.in);
        System.out.print("请输入工资：");
        double salary=input.nextInt();
        double over=salary-3500;
        double tare;
        if(over>80000)   
        	tare=over*0.45;
        else if(over>55000)
        	tare=over*0.35;
        else if(over>35000)
        	tare=over*0.3;
        else if(over>9000)
        	tare=over*0.25;
        else if(over>4500)
        	tare=over*0.2;
        else if(over>1500)
        	tare=over*0.1;
        else if(over>0)
        	tare=over*0.03;
        else
        	tare=0;
        
        System.out.println("所需要缴纳的税费为："+tare);
   }
}

