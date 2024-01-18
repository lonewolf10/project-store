package java_practice_workbook;

public class Modern_car extends Classic_car
    {
   public void additional_feature()
   {
	   System.out.println("New variant of classic car is available");
   }
	public static void main(String[] args) 
	{
	Modern_car obj = new Modern_car();
	obj.feature();
    }

}
