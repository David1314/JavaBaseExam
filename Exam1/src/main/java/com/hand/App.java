package com.hand;


public class App 
{
    public static void main( String[] args )
    {
        int count=0;
        int a[]=new int[100];
        for(int i=101;i<=200;i++){
            boolean flag=true;
        	for(int j=2;j<Math.sqrt(i);j++){
        		if(i%j==0){
        			flag=false;
        			break;
        		}
        	}
        	if(flag){
        		count++;
        		a[count]=i;
        	}
        }
        System.out.print("101-200间总共有"+count+"个素数，分别是");
        for(int i=0;i<a.length;i++){
        	if(a[i]!=0&&a[i+1]!=0){
        		System.out.print(a[i]+",");
        	}
        	if(a[i]!=0&&a[i+1]==0){
        		System.out.print(a[i]);
        	}
        	
        }
    }
}
