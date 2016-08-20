import java.util.*;

public class ArrayListExp 
{


   public static void main(String args[]) 
	{
      		// Create an array list
      		ArrayList al = new ArrayList();
      		// add elements to the array list
      		al.add("Delhi");
      		al.add("Bangalore");
      		al.add("Kolkata");
      		al.add("Chandigarh");
      		al.add("Pune");
      		al.add("Mumbai");


		System.out.print("List of elements in Arraylist: ");
      		Iterator itr = al.iterator();
      		while(itr.hasNext()) 
		{
         		Object element = itr.next();
		         System.out.print(element + " ");
      		}
	}
}