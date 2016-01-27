package com.abc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

//		Arrays.asList("a","b","c").sort((e1,e2)-> e1.compareTo(e2));
		
	Arrays.asList("a","b","c").sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
	}

}
