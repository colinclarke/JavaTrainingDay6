package com.hcl.day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {

		System.out.println("============ 1 ============");
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Blue");
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Indigo");
		System.out.println(colorList);

		System.out.println("\n============ 2 ============");
		colorList.forEach((color) -> {
			System.out.println(color);
		});

		System.out.println("\n============ 3 ============");
		Collections.reverse(colorList);
		System.out.println(colorList);

		System.out.println("\n============ 4 ============");
		HashSet<String> colorSet = new HashSet<String>();
		colorSet.add("Red");
		colorSet.add("Green");
		colorSet.add("Orange");
		System.out.printf("Set 1: %s\n", colorSet);
		HashSet<String> fruitSet = new HashSet<String>();
		fruitSet.add("Grape");
		fruitSet.add("Orange");
		fruitSet.add("Pear");
		System.out.printf("Set 2: %s\n", fruitSet);
		HashSet<String> intersection = new HashSet<String>(colorSet);
		intersection.retainAll(fruitSet);
		System.out.printf("Intersection: %s\n", intersection);

		System.out.println("\n============ 5 ============");
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(9);
		numbers.add(42);
		numbers.add(3);
		numbers.add(7);
		numbers.add(6);
		System.out.println("Using forEach:");
		numbers.forEach((num) -> {
			if (num < 7) {
				System.out.println(num);
			}
		});
		System.out.println("Using for loop:");
		for (Integer i : numbers) {
			if (i < 7) {
				System.out.println(i);
			}
		}

		System.out.println("\n============ 6 ============");
		HashMap<String, Integer> nameAgeMap = new HashMap<>();
		nameAgeMap.put("Nick", 22);
		nameAgeMap.put("Jim", 55);
		nameAgeMap.put("Patrick", 91);
		nameAgeMap.put("Chris", 8);
		System.out.println(nameAgeMap.size());

		System.out.println("\n============ 7 ============");
		System.out.println("Unsorted keys: ");
		System.out.println(nameAgeMap.keySet());

		System.out.println("\n============ 8 ============");
		ArrayList<String> mapKeys = new ArrayList<>();
		mapKeys.addAll(nameAgeMap.keySet());
		Collections.sort(mapKeys);
		System.out.println("Keys sorted by name: ");
		System.out.println(mapKeys);

		System.out.println("\n============ 9 ============");
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formattedDateTime = date.format(formatter);
		System.out.println(formattedDateTime);

		System.out.println("\n============ 10 ============");
		String regex = "(\\d{2}\\/\\d{2}\\/\\d{4}) (\\d{2}:\\d{2})";
		Matcher matcher = Pattern.compile(regex).matcher(formattedDateTime);
		if (matcher.find()) {
			System.out.printf("Date: %s\n", matcher.group(1));
			System.out.printf("Time: %s\n", matcher.group(2));
		}

		System.out.println("\n============ 11 ============");
		Calendar calendar = Calendar.getInstance();
		System.out.printf("Year: %d\n" + "Month: %d\n" + "Day: %d\n" + "Hour: %d\n" + "Minute: %d\n",
				calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH),
				calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE));

		System.out.println("\n============ 12 ============");
		calendar = new GregorianCalendar(2021, 0, 1);
		System.out.printf(
				"Max year value: %d\n" + "Max month value: %d\n" + "Max week value: %d\n" + "Max date value: %d\n",
				calendar.getActualMaximum(Calendar.YEAR), calendar.getActualMaximum(Calendar.MONTH),
				calendar.getActualMaximum(Calendar.WEEK_OF_YEAR), calendar.getActualMaximum(Calendar.DATE));

		System.out.println("\n============ 13 ============");
		calendar = new GregorianCalendar(2021, 1, 1);
		System.out.printf("Amount of days in February in 2021: %d\n", calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar = new GregorianCalendar(2000, 1, 1);
		System.out.printf("Amount of days in February in 2000: %d\n", calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

		System.out.println("\n============ 14 ============");
		System.out.printf("Amount of days in February in 2000: %d\n", UserMainCode.getNumberOfDays(2000, 1));

		System.out.println("\n============ 15 ============");
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 1, 17, 11, 19));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 2, 7, 6, 20));
		ArrayList<Integer> ret = UserMainCode.sortMergedArrayList(list1, list2);
		System.out.println(ret);

	}
}
