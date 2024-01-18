package java_practice_workbook;

import java.util.ArrayList;

public class Array_list_exp {

	public static void main(String[] args) 
	{
		
    ArrayList<Integer> obj = new ArrayList<Integer>();  //syntax for ARRAY-LIST declaration
    
    obj.add(10);
    obj.add(20);
    obj.add(30);
    System.out.println(obj);
    obj.size();
    System.out.println(obj.size());
    obj.get(2);
    System.out.println(obj.get(2));
    obj.add(3, 99);
    System.out.println(obj);
    obj.add(4, 199);
    System.out.println(obj);
    obj.set(3, 20);
    System.out.println(obj);
    obj.contains(99);
    System.out.println(obj.contains(20));
    //obj.clear();
    System.out.println(obj);      // To print existing Array List again
    // using for-loop
    for(int i=0 ; i<obj.size() ; i++)
    {
    	System.out.print(obj.get(i)+" ");
    }
    System.out.println();
    // using for-each loop
    for(int j:obj)
    {
    	System.out.println(j);
    }
	}

}
