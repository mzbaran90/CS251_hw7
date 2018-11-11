import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SetDriver {
	
	public static void main(String [] args) {
		
		List <Integer> list1 = new ArrayList<>();
		List <Integer> list2 = new ArrayList<>();
		List <Integer> list3 = new LinkedList<>();
		List<Integer> list4 = new LinkedList<>();
		
		list1.addAll(Arrays.asList(10,2,3,4,5,8,9,1));
		list2.addAll(Arrays.asList(4,9,3,1,2));
		list3.addAll(Arrays.asList(12,34,2,5));
		list4.addAll(Arrays.asList(2,5,12,34));
		
		
		display(list1);
		display(list2);
		
		// sort method
		Sets.sort(list3);
		display(list3);
		
		
		
		// isElement 
		if(Sets.isElement(3, list1)) {
			System.out.println("Element found!");
		}
		else {
			System.out.print("Element not found");
		}
		
		System.out.println();
		
		// is subSet
		if(Sets.isSubset(list2, list1)) {
			System.out.println("Subset found!");
		}
		else {
			System.out.println("No subset found");
		}
		
		System.out.println();
		
		//isSuperSet
		
		if(Sets.isSuperSet(list3, list1)) {
			System.out.println("Superset found!");
		}
		else {
			System.out.println("no subset found");
		}
		
		//subtract
		
		List <Integer> tempList = Sets.subtract(list1, list3);
		display(tempList);
		
		// equals 
		
		if(list3.equals(list4)) {
			System.out.println("Lists consist of same values in same order");
		}
		
		else {
			
			System.out.println("These lists do not match");
		}
		
		System.out.println();
		
		// union
		
		display(Sets.union(list2, list3));
		
		//intersection
		
		display(Sets.intersection(list1, list3));
		
		//cartestian product
		
		System.out.println(Sets.cartesianProduct(list2, list4));
		
		System.out.println();
		
		//complements
		display(Sets.complement(list2, -1, 10));
	
	}
	public static void display (List<Integer> list) {
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n");
	}

}
