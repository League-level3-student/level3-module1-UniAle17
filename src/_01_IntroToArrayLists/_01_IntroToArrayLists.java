package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList <String> list = new ArrayList <String>();
		

		//2. Add five Strings to your list
		
		list.add("Sushi");
		list.add("Ice Cream");
		list.add("Cookies");
		list.add("Lemonade");
		list.add("Rice");
		
		
		//3. Print all the Strings using a standard for-loop
		
		for (int i = 0; i < list.size(); i++) {
			
			String lists= list.get(i);
			
			
			System.out.println(lists);
			
		}
		
		//4. Print all the Strings using a for-each loop
		
		for(String listst : list) {
			
			System.out.println(listst);
			
		}
		
		//5. Print only the even numbered elements in the list.
		for (int j = 0; j < list.size(); j++) {
			
			String lists = list.get(j);
			
			if() {
				
			}
				
		}
		
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
