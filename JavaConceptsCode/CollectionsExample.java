package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsExample {

	public void failFast() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Integer number = iterator.next();
			numbers.add(50); // This line will throw error
		}
	}

	public void failSafe() {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("a", "b", "c"));
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals("b")) {
				list.remove("b"); // This will not cause an exception
			}
		}
		System.out.println(list); // ["a", "c"]
	}

	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionsExample c = new CollectionsExample();

//		Fail-Fast Iterators:
//		c.failFast();

//		Fail-Safe Iterators:
//		c.failSafe();

		// HashMap allows one null key and any number of null values.
//		 Map<String, Integer> hashMap = new HashMap<>();
//		 hashMap.put(null,null);

		// Hashtable does not allow null keys or values
//		 Map<String, Integer> hashtable = new Hashtable<>();
//		 hashtable.put(null,null); //exception

//		EnumSet
//		EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
//		System.out.println("Weekend days: " + weekend); // Weekend days: [SATURDAY, SUNDAY]
//
//		EnumSet<Day> workdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
//		System.out.println("Workdays: " + workdays); // Workdays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
//
//		EnumSet<Day> allDays = EnumSet.allOf(Day.class);
//		System.out.println("All days: " + allDays); // All days: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
//													// SATURDAY, SUNDAY]

//		EnumMap
//		EnumMap<Day, String> activityMap = new EnumMap<>(Day.class);
//		activityMap.put(Day.MONDAY, "Gym");
//		activityMap.put(Day.TUESDAY, "Swimming");
//		activityMap.put(Day.WEDNESDAY, "Running");
//
//		for (Day day : Day.values()) {
//			System.out.println(day + ": " + activityMap.getOrDefault(day, "No activity"));
//		}
//		// MONDAY: Gym
//		// TUESDAY: Swimming
//		// WEDNESDAY: Running
//		// THURSDAY: No activity
//		// FRIDAY: No activity
//		// SATURDAY: No activity
//		 SUNDAY: No activity

		// Creating a LinkedHashMap
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//
//        // Adding key-value pairs
//        linkedMap.put("one", 1);
//        linkedMap.put("two", 2);
//        linkedMap.put("three", 3);
//        linkedMap.put("four", 4);
//
//        // Printing the map
//        System.out.println(linkedMap); // Output: {one=1, two=2, three=3, four=4}
//
//        // Accessing an entry to check if the order is maintained
//        System.out.println("Value for key 'two': " + linkedMap.get("two"));
//
//        // Iterating through the LinkedHashMap
//        System.out.println("Iterating over LinkedHashMap:");
//        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//
//        // Using LinkedHashMap with access-order enabled (for LRU caching)
//        Map<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
//        accessOrderMap.put("one", 1);
//        accessOrderMap.put("two", 2);
//        accessOrderMap.put("three", 3);
//        accessOrderMap.put("four", 4);
//
//        // Accessing some elements
//        accessOrderMap.get("one");
//        accessOrderMap.get("three");
//
//        // Printing after access to show LRU order (least recently used goes to end)
//        System.out.println("LinkedHashMap with Access Order: " + accessOrderMap);
//        // Output: {two=2, four=4, one=1, three=3}

//		ConcurrentHashMap
//		 Map<String, Integer> map = new ConcurrentHashMap<>();
//	        map.put("one", 1);
//	        map.put("two", 2);
//	        map.put("three", 3);
//
//	        map.forEach((key, value) -> System.out.println(key + ": " + value));
//
//	        // Concurrent modification example
//	        map.computeIfAbsent("four", k -> 4);
//	        System.out.println("four: " + map.get("four"));

//		PriorityQueue vs Queue
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		pq.offer(3);
//		pq.offer(1);
//		pq.offer(2);
//
//		System.out.println(pq.poll()); // Outputs: 1 (smallest element)
//
//		Queue<Integer> queue = new LinkedList<>();
//		queue.offer(3);
//		queue.offer(1);
//		queue.offer(2);
//
//		System.out.println(queue.poll()); // Outputs: 3 (first inserted element)
		
//		synchronized collections vs concurrent collections
		 List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
	        synchronizedList.add("one");
	        synchronizedList.add("two");

	        synchronized (synchronizedList) {
	            for (String item : synchronizedList) {
	                System.out.println(item);
	            }
	        }
	        
	        ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();
	        concurrentMap.put("one", "1");
	        concurrentMap.put("two", "2");

	        for (String key : concurrentMap.keySet()) {
	            System.out.println(key + ": " + concurrentMap.get(key));
	            concurrentMap.put("one", "10");
	        }
	        
	        for (String key : concurrentMap.keySet()) {
	            System.out.println(key + ": " + concurrentMap.get(key));
	        }


	}

}
