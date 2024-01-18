package java_practice_workbook;

import java.util.Arrays;

public class Array_int_exp {

	public static void main(String[] args) 
	{
       int a[] = new int[5];
       a[0] = 66 ;
       a[1] = 77 ;
       a[2] = 88 ;
       a[3] = 99 ;
       a[4] = 100 ;
        System.out.println(a.length );
       
       // using for-loop 
       for(int i =0 ; i<a.length; i++ )
       {
    	   System.out.println(a[i]);
       }
       System.out.println();
      // using for-each loop
       for(int j:a)
       {
    	   
    	   System.out.print(j+" ");
       }
	}

}
