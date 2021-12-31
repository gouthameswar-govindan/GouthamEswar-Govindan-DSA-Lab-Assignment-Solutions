package com.dsalab.financialcompany;

import java.util.Arrays;
import java.util.Scanner;

public class Stockers {

	private static int num = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of companies:");
		int noOfCompanies = sc.nextInt();
		double arr[] = new double[noOfCompanies];
		boolean countCompanies[] = new boolean[noOfCompanies];
		Counter object = new Counter();
		for (int i = 0; i < arr.length; i++) {

			for (i = 0; i < arr.length; i++) {
				System.out.println("Enter the current stock price of the company " + (i + 1));
				arr[i] = sc.nextDouble();
				System.out.println("Whether company's stock price rose today compare to yesterday?");
				countCompanies[i] = sc.next() != null;
			}

		}
		while (num <= 6) {

			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Enter the operation that you want to perform" + "\n"
					+ "1.Display the companies stock prices in ascending order" + "\n"
					+ "2.Display the companies stock prices in decending order" + "\n"
					+ "3.Display the total no of companies for which stock prices rose today" + "\n"
					+ "4.Display the total no of companies for which stock prices declined today" + "\n"
					+ "5.Search a specific stock price" + "\n" + "6.press 0 to exit" + "\n");
			System.out.println("--------------------------------------------------------------------------");
			num--;

			int option = sc.nextInt();
			switch (option) {
			case 1 -> {

				sortArrayAscending(arr);
				System.out.println("Stock Prices in Ascending order are: ");

				System.out.println(Arrays.toString(arr));

				System.out.println("--------------------------------------------------------------------------");
				break;
			}
			case 2 -> {
				sortArrayDescending(arr);
				System.out.println("Stock Prices in Descending order are: ");

				System.out.println(Arrays.toString(arr));

				System.out.println("--------------------------------------------------------------------------");
				break;

			}

			case 3 ->

				System.out.println(
						"Total no of Companies whose stock prices rose today: " + object.countTrue(countCompanies));

			case 4 ->

				System.out.println("Total no of Companies whose stock prices declined today: "
						+ object.countFalse(countCompanies));

			case 5 -> {
				System.out.println("Enter the key value:");
				double value = sc.nextDouble();
				searchStack(arr, value);
				System.out.println("--------------------------------------------------------------------------");
				break;

			}

			case 6 -> {
				System.out.println("Press 0 to exit");
				int value = sc.nextInt();
				System.out.println("Exited Successfully");
				System.out.println("--------------------------------------------------------------------------");
				System.exit(0);

				break;
			}
			default -> System.out.println("Option Invalid! Select a Valid Option ");

			}
		}
	}

	private static void searchStack(double[] arr, double value) {

		int i = 0;
		if (value == arr[i]) {
			System.out.println("Stock of value " + value + " is present");

		} else

			System.out.println("Stock Value not found");

	}

	private static void sortArrayDescending(double arr[]) {
		for (int i = 0; i < arr.length - 1; i++) { // Descending Order
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					double temp = arr[j]; // Swapping Values by Using Temporary Variable temp.
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}

	private static void sortArrayAscending(double arr[]) {
		for (int i = 0; i < arr.length - 1; i++) { // Ascending Order
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j]; // Swapping Values by Using Temporary Variable temp.
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}

}
