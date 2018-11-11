import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Sets {

	/**
	 * Check if passed in Integer is part of passed in List.
	 * 
	 * @param i
	 * @param list
	 * @return booelan
	 */
	public static boolean isElement(Integer i, List<Integer> list) {
		//TODO
		if (list.contains(i)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Check if list1 is a subset of list2.
	 * Subset means all elements in list1 must be in list2.
	 * If so return true, else return false.
	 * 
	 * @param list1
	 * @param list2
	 * @return boolean
	 */
	public static boolean isSubset(List<Integer> list1, List<Integer> list2) {
		//TODO
		
		
		
		for(Integer item: list1) {
			if (!(list2.contains(item))) {
				return false;
			}
		
		}
		return true;
		
	}
	
	/**
	 * Check if list1 is a super set of list2.
	 * Super set means all elements in list2 must be in list1.
	 * Return true if so, false otherwise.
	 * 
	 * @param list1
	 * @param list2
	 * @return boolean
	 */
	public static boolean isSuperSet(List<Integer> list1, List<Integer> list2) {
		//TODO
//		for(Integer item: list2) {
//			if(!(list1.contains(item))){
//				return false;
//			}
//		}
//		return true;
		
		Iterator<Integer> newThang = list2.iterator();
		while(newThang.hasNext()) {
			if(!(list1.contains(newThang.next()))) {
				return false;
			}
		}
		return true;
		
	}
	
	
	/**
	 * Perform the union of list1 and list2.
	 * Union means take all elements from each List and combine them into one List.
	 * If duplicate elements, only include one of the element.
	 * For example, if 3 occurred in both Lists, the resulting List will only contain one 3.
	 * This method will return a new combined List that is sorted from smallest to largest.
	 * 
	 * @param list1
	 * @param list2
	 * @return list
	 */
	public static List<Integer> union(List<Integer> list1, List<Integer> list2){
		//TODO
		
//		List<Integer> union = new LinkedList<>();
		
//		//add all elements form list1 to union list
//		for(Integer item1:list1) {
//			union.add(item1);
//		}
//		
//		// check for duplicates, if not add element form list2 to union list
//		for(Integer item2:list2) {
//			if(!(union.contains(item2))) {
//				union.add(item2);
//			}
//		}
//		Collections.sort(union);
//		return union;
		
		List<Integer> union = new LinkedList<>();
		union.addAll(list1);

		for(Integer item2:list2) {
			if(!(union.contains(item2))) {
				union.add(item2);
			}

		}
		sort(union);
		return union;
	}
	/**
	 * Perform intersection of list1 and list2.
	 * Intersection means to only include an element if it is in both Lists.
	 * This method will return a new interesected List that is sorted from smallest to largest.
	 * 
	 * @param list1
	 * @param list2
	 * @return list
	 */
	public static List<Integer> intersection(List<Integer> list1,List<Integer> list2){
		//TODO
		List<Integer>intersection = new LinkedList<>();
		
		for(Integer item: list1) {
			if(list2.contains(item)) {
				intersection.add(item);
			}
		}
		sort(intersection);
		return intersection;
	}
	
	/**
	 * Perform subtract of sets.  list1 - list2.
	 * The result will be a List that contains all elements in list1 minus any elements that also occur in list2.
	 * This method will return a new subtracted List that is sorted from smallest to largest.
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static List<Integer> subtract(List<Integer> list1, List<Integer> list2){
		//TODO
		
		List<Integer> subtract = new ArrayList<>();
		
		for(Integer item: list1) {
			if(!(list2.contains(item))) {
				subtract.add(item);
			}
			
		}
		sort(subtract);
		return subtract ;
	}
	
	/**
	 * Two lists are equal if all the elements in list1 occur in list2, and all elements in list2 occur in list1.
	 * Order does matter here.
	 * 
	 * @param list1
	 * @param list2
	 * @return boolean
	 */
	
	public static boolean equals(List<Integer> list1, List<Integer> list2) {
		
		if(list1.equals(list2)) {
			return true;
		}
		return false;
		
	}
	
	/**
	 * Perform the cartesian product of two lists.
	 * This method will store the result as a List that holds strings since Java does not allow Tuples.
	 * Both lists must be sorted before performing the cartesian product.
	 * Elements in list1 should be the first element in each product.
	 * If the either list is empty, return a empty List.
	 * 
	 * See handout for example.
	 * 
	 * @param list1
	 * @param list2
	 * @return list
	 */
	public static List<String> cartesianProduct(List<Integer> list1, List<Integer> list2){
		//TODO
		
		List<String>cartesianProduct = new ArrayList<>();
		
		//sort both lists
		
		sort(list1);
		sort(list2);
		
		// iterate through both lists to mimic tuples
		for(Integer innerInt:list1) {
			for(Integer outerInt: list2) {
				cartesianProduct.add("(" + innerInt.toString() + "," + outerInt.toString()+ ")");
			}
		}
		return cartesianProduct;
	}
	
	
	/**
	 * Sort the list passed in from smallest to the larget.
	 * Notice, there is no return type, so this sorts the List in place.
	 * 
	 * @param list
	 */
	public static void sort(List<Integer> list) {
		//TODO
		Collections.sort(list);
	}
	
	
	
}
