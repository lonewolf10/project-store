package java_practice_workbook;

public class Array_for_int {

	public static void main(String[] args) {
		int a[] = {10 ,20 ,30 , 40, 50};
		
		//USING FOR--LOOP
      for(int i=0 ; i<=4 ; i++) // using index position 
      {
      System.out.println(a[i]);
      }
      System.out.println();
   for(int j = 4 ; j>=0 ; --j)  // to reverse array
   {
	   System.out.println(a[j]);
   }
   }
}
