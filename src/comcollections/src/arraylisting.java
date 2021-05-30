package comcollections.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arraylisting {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		ArrayList<String> al=new ArrayList<String>();
		al.add(s.nextLine());
		al.add(s.nextLine());
		al.add(s.nextLine());
		al.add(s.nextLine());
		al.add(s.nextLine());
		
		
		
		//using iterator 
		
		Iterator<String> itr= al.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		//traverse with for each loop
		for(String fruit : al) {
		
		System.out.println(fruit);
		}
		
		System.out.println(al);
		
		System.out.println("Get the index the array:-"+al.get(3));
		
		al.set(3, "badboy");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al);
		
		
		
	}

}
