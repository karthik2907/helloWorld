import java.util.*;
public class Comparable_Interface {
	
	class Names implements Comparable<Names>{
		private String name;
		

		@Override
		public int compareTo(Comparable_Interface.Names o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------COMPARABLE custom  SORT DEMO----------------");
		LinkedList<String> Countries = new LinkedList<>();
		Countries.add("India");
		Countries.add("USA");
		Countries.add("UK");
		Countries.add("Russai");
		System.out.println(Countries);
		printList(Countries);
		
	}
	static void  printList(LinkedList<String> list) {
		for(String ele:list) {
			System.out.println("Element:"+ele);
		}
	}
}
