package com.hcl.day6;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UserMainCode {
	static int getNumberOfDays(int year, int month) {
		YearMonth ym = YearMonth.of(year, month + 1);
		return ym.lengthOfMonth();
	}

	static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> temp = new ArrayList<>(a);
		temp.addAll(b);
		Collections.sort(temp);
		ArrayList<Integer> ret = new ArrayList<>(Arrays.asList(temp.get(2), temp.get(6), temp.get(8)));
		return ret;
	}
}
