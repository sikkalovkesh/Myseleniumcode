
package comcollections.src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class hashset {
		
		int id;
		String name;
		String schoolname;
		
		hashset(int id ,String name, String schoolname){
			this.id=id;
			this.name=name;
			this.schoolname=schoolname;
			
			
		}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
//		HashSet<String> hs= new HashSet<String>();
//		hs.add(sc.nextLine());
//		hs.add(sc.nextLine());
//		hs.add(sc.nextLine());
//		hs.add(sc.nextLine());
//		
//		Iterator<String> itr=hs.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println("print the final output:-"+hs);
		
		//TREESET(MAINTAINS ONLY ASENDIIG ORDER
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add(sc.nextLine());
		ts.add(sc.nextLine());
		ts.add(sc.nextLine());
		ts.add(sc.nextLine());
		Iterator<String> itr=ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(ts);
		
		
	}

}
