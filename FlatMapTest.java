package com.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Apple","Mange","grapes");
		
		list.stream().flatMap(s->Stream.of(s.charAt(2))).forEach(System.out::println);
		
		list.stream().flatMap(s->Stream.of(s.charAt(4))).forEach(System.out::println);
	}

}
