package test.test;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "A");
		hm.put("2", "B");
		hm.put("3", "C");
		hm.put("4", "D");
		printusingIterator(hm);
		System.out.println("******************************");
		printusingForLoop();
		System.out.println("******************************");
		printusingStream();
	}

	private static void printusingIterator(Map map) {
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> pair = it.next();
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}
	}

	private static void printusingForLoop() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "A");
		hm.put("2", "B");
		hm.put("3", "C");
		hm.put("4", "D");
		for (Map.Entry<String, String> pair : hm.entrySet()) {
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}
		System.out.println("******************************");
		Set<String> keyset = hm.keySet();
		System.out.println(keyset);
		
		Iterator it = keyset.iterator();
		while (it.hasNext()) {
			System.out.println(hm.get(it.next()));
		}

	}

	private static void printusingStream() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "A");
		hm.put("2", "B");
		hm.put("3", "C");
		hm.put("4", "D");
		System.out.println("******************************");
		hm.entrySet()
			.iterator()
			.forEachRemaining(e -> System.out.println(e.getKey()+":"+e.getValue()));
		
		Instant start = Instant.now();
		System.out.println("******************************");
		hm.entrySet()
			.stream()
			.forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
		
		start = Instant.now();
		System.out.println("******************************");
		hm.entrySet()
			.stream()
			.parallel()
			.forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
		end = Instant.now();
		timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

	}

}
