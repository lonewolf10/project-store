package java_practice_workbook;

import java.util.ArrayList;

public class Array_list_for_String {

	public static void main(String[] args) 
	{
		
	ArrayList<String> a = new ArrayList<String>();
	
	a.add("Engine");                 // 1. add() method.
	a.add("Clutch");
	a.add("Brake");
	a.add("Steering");
	a.add("DashBoard");
	System.out.println(a);
	a.size();
	System.out.println(a.size());     // 2. size() method
	//a.get(5);                      // To get exception intentionally
	a.get(4);                       //   3. get() method
	System.out.println(a.get(4));
	a.add(5, "Navigator");           //  4. add-on() method
	System.out.println(a);
	a.add(0, "Seat");
	System.out.println(a);
	//a.set(7, "Electricals");      // To get exception intentionally
	a.set(6, "Electricals");         //  5. set() method 
	System.out.println(a);
	a.contains("Horn");               // 6. contains() method
	System.out.println(a.contains("Horn"));
	//a.clear();                     // 7. Clear() method
	//System.out.println(a);
	for(int i=0 ; i<a.size() ; i++)   // Using For-Loop
	{
		System.out.print(a.get(i)+" ");
	}
	System.out.println();
	for(String j:a)                // Using For-Each Loop
	{
		System.out.print(j+" +  ");
	}
	}
}
