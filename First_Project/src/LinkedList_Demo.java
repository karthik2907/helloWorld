import java.util.*;
public class LinkedList_Demo {

	public static void main(String[] args) {
		System.out.println("---------LINKED LIST DEMO----------------");
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
		list.remove(2);
		System.out.println("---------Printing after element removed----------------");
		for(String ele:list) {
			System.out.println("Element:"+ele);
		}
		Collections.reverse(list);
		System.out.println("---------adding element----------------");
		list.add(2, "Egypt");
		for(String ele:list) {
			System.out.println("Element:"+ele);
		}
	}

}
