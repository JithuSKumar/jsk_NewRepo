package collectionArrayList;

import java.util.ArrayList;

public class ArrayListGet {

	public static void main(String[] args)
	{
		ArrayList <String> listObj = new ArrayList<String>();
		listObj.add("Apple");
		listObj.add("Ball");
		listObj.add("Cat");
		listObj.add("Dog");
		listObj.add("Egg");
		System.out.println("Array: " + listObj);
		
		System.out.println(listObj.get(2));
	}

}
