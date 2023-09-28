import java.util.*;
public class Stack_methods {

	public static void main(String[] args) {
		Stack<Integer> demo= new Stack<>();
		System.out.println("---------INSERTING ELEMENTS INTO THE STACK----------------");

		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(4);
		demo.push(5);
		demo.push(3);
		System.out.println("---------PRINT STACK ELEMENTS----------------");

		for(Integer temp: demo) {
			System.out.print(temp+" ");
		}
		System.out.println("\n---------REMOVING STACK EELEMENTS(TOP OF THE STACK ELEMENT WILL BE REMOVED)----------------");

		demo.pop();
		System.out.println();
		for(Integer temp: demo) {
			System.out.print(temp+" ");
		}
		System.out.println("\n---------PRINT TOP OF THE STACK----------------");

		System.out.println("\n"+demo.peek());
		
		System.out.println("---------CHECK WHETHER STACK IS EMPTY OR NOT----------------");
		if(demo.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
			
		}
		System.out.println("----------SEARCHING OF AN ELEMENT IN STACK ---------------");
		System.out.println(demo.search(5));
		System.out.println(demo.search(50));

				
	}

}
