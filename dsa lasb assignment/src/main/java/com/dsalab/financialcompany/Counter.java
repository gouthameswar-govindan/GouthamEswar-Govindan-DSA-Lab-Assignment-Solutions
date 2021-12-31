package com.dsalab.financialcompany;

import java.util.Arrays;

public class Counter {
	public static int countTrue(boolean[] countCompanies) {
		int count = 0;
		for (int i = 0; i < countCompanies.length; i++) {
			if (countCompanies[i]) {
				count++;
			}
		}

		return count - 1;
	}

	public static int countFalse(boolean[] countCompanies) {
		int count = 0;
		for (int i = 0; i < countCompanies.length; i++) {
			if (countCompanies[i] == false) {
				count++;

			}
		}

		return count + 1;
	}
}
