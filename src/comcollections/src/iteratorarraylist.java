package comcollections.src;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorarraylist {
	
	int rollno;
	String firstName;
	String lastName;
	
	iteratorarraylist(int rollno,String firstName,String lastName){
		this.rollno=rollno;
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
	
	public static void main(String[] args) {
	
		iteratorarraylist list=new iteratorarraylist( 1, "lovkesh","sikka" );
		iteratorarraylist list1=new iteratorarraylist( 1, "pravleen","kaur" );
		iteratorarraylist list2=new iteratorarraylist( 1, "karan","sawhney" );

		ArrayList<iteratorarraylist> al=new ArrayList<iteratorarraylist>();
		al.add(list);
		al.add(list1);
		al.add(list2);
		
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			iteratorarraylist it=(iteratorarraylist) itr.next();
			System.out.println(it.rollno+" "+it.firstName+" "+it.lastName);
		}
		
	
	}
}
