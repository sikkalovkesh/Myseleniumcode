package comcollections.src;


import java.util.*;

public class list {
	
	public static void main(String[] args) {
		//simple code for list
		List<String> li=new ArrayList<String>();
		li.add("apple");
		li.add("orange");
		li.add("pineapple");
		
		for(String fruits:li) {
			System.out.println(fruits);
		}
		
		System.out.println("Return the data:-"+li.get(1));
		
		li.set(1, "watermelon");
		System.out.println("print the update data:-"+li);
		
		Collections.sort(li);
		System.out.println(li);
		
//		//array to list
//		String arr[]= {"lovkesh","sikka","software","testengineer"};
//		System.out.println("print array:-"+Arrays.toString(arr));
//		
//		List<String> li=new ArrayList<String>();
//		for(String info: arr) {
//			li.add(info);
//		}
//		System.out.println("print array to list:-"+li);
//		
		
		
	}
	

}
