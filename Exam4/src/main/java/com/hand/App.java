package com.hand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("�������50��С��100�������ֱ��ǣ�");
        int[] a=new int[50];
        for(int i=0;i<50;i++){
        	a[i]=(int) (101*Math.random());
       	System.out.print(a[i]+" ");
        }
        System.out.println();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
        		map.put(a[i]/10, a[i]);
        	}
        System.out.print("Map�е�����Ϊ��{");
        for(int i=0;i<10;i++){
        	if(map.get(i) != null){
        	//	Collection<Integer> coll= map.values(i);
        		System.out.print(i+"=>"+map.get(i)+",");
        		
        	}
      }
        
         
    }
}
