package comcollections.src;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
	
	int accountno;
	String holder_name;
	String acctype;
	
	linkedlist(int accountno, String holder_name , String acctype) {
		this.accountno=accountno;
		this.holder_name=holder_name;
		this.acctype=acctype;
		
	}
	
	public static void main(String[] args) {
		
		linkedlist li=new linkedlist(123, "lovkessikka", "saving");
		linkedlist li1=new linkedlist(124, "rahul", "current");
		
		LinkedList<linkedlist> lii=new LinkedList<linkedlist>();
		lii.add(li);
		lii.add(li1);
		
		Iterator itr=lii.iterator();
		while(itr.hasNext()) {
			linkedlist it=(linkedlist)itr.next();
			System.out.println(it.accountno+""+it.holder_name+""+it.accountno);
			
		}
		
		
		
		
		
	}
	

}
