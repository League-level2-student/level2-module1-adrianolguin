package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList<String> strings = new ArrayList<String>();
		
		//2. Add five Strings to your list
		
		String First = "1",Second = "2",Third = "3",Fourth = "4",Fifth = "5";
		
		strings.add(First);
		strings.add(Second);
		strings.add(Third);
		strings.add(Fourth);
		strings.add(Fifth);
		
		
		//3. Print all the Strings using a standard for-loop
		
//		for(int x  = 0; x < strings.size(); x++) {
//			System.out.println(strings.get(x));
//	}
		
		//4. Print all the Strings using a for-each loop
		
//		for(String j : strings){
//			System.out.println(j);
//		}
	
		
		//5. Print only the even numbered elements in the list.
		
//	for(String j : strings){
//		if(j % 2 == 0) {
//		System.out.println(j);
//		}
//	}
//}
	
//	for(int x = 0; x < strings.size(); x++){
//		if(x % 2 == 0) {
//			System.out.println(strings.get(x));
//		}	
//	}
	
		//6. Print all the Strings in reverse order.
		
	for(int x = strings.size() - 1; x >= 0; x--) {
		System.out.println(strings.get(x));
	}
	
		//7. Print only the Strings that have the letter 'e' in them.
	}
}

