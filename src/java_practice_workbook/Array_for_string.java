package java_practice_workbook;

import java.util.Arrays;

public class Array_for_string {

	public static void main(String[] args) {
		String s[] = {"ajay" , "akshay" , "amit" , "alok"};
		
		System.out.println(Arrays.toString(s));
		
		System.out.println(s.length);
		
		System.out.println(s[0]);
		s[1] ="kesari" ;
		System.out.println(s[1]);
		System.out.println(Arrays.toString(s));
		System.out.println();
		// using for loop ;
		for(int i = 0 ; i<4 ; i++)
		{
			System.out.println(s[i]);
		}
		System.out.println();
       // using for-each loop ;
		for(String j:s)
		{
			System.out.print(j +" ");
		}
	}

}
