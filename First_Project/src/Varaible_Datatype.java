import java.util.*;
public class Varaible_Datatype {
	public static void main(String args[])
	{
		ArrayList<Integer> al= new ArrayList<>(10);
		
		al.add(12);
		al.add(132);
		System.out.println(al);
		
		System.out.println("---After adding two numbers---");
		ArrayList<Integer> bl=remove_number(al);
		for(int i:bl) {
			System.out.print(i+" ");
			
		}
	}

	private static ArrayList<Integer> remove_number(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		al.add(12);
		al.add(131);
		return al;
		
		
	}

}
