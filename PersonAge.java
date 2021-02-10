package ques1;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {

		// Declare an array
		int age[] = new int[10];
		int childCount = 0, adultCount = 0, seniorCitizenCount = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");

		// Taking input from user

		for (int i = 0; i < age.length; i++) {
			age[i] = sc.nextInt();
		}

		// For verifying age

		for (int i = 0; i < age.length; i++) {
			if (age[i] < 18) {
				childCount++;
			}

			else if (age[i] >= 18 && age[i] <= 54) {
				adultCount++;
			} else {
				seniorCitizenCount++;
			}
		}

		// For display Output

		System.out.println("Children :" + childCount);
		System.out.println("Adult :" + adultCount);
		System.out.println("Senior Citizen :" + seniorCitizenCount);

	}

}
