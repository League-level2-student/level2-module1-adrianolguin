package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList<String> strings = new ArrayList<String>();
		
		ArrayList<Integer> ints = new ArrayList<Integer>();

		
		//2. Add five Strings to your list
		
		String First = "e1",Second = "e2",Third = "Hello",Fourth = "4",Fifth = "5";
		
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
		
//	for(int x = strings.size() - 1; x >= 0; x--) {
//		System.out.println(strings.get(x));
//	}
	
	
	int k = strings.indexOf("e");
	
	for(int x = 0; x < strings.size();x ++) {
		
		String idk = strings.get(x);
	
		if(idk.contains("e")) {
		System.out.println(idk);
		}
	}

//	
//	System.out.println(strings.get(k));
	

//7. Print only the Strings that have the letter 'e' in them.
	
	ints.add(1);
	ints.add(2);
	ints.add(3);
	ints.add(4);
	
	System.out.println(ints.get(2));

	
	int an = ints.remove(2);
	System.out.println(an);
	
	System.out.println(ints.get(2));
	
	}
}

