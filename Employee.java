package ques3;

public class Employee extends Exception {

	// Declare variables
	private String firstName;
	private String lastName;

	// Parameterized Constructor
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// ToString Method
	@Override
	public String toString() {
		return " Full Name :" + firstName + " " + lastName + "";
	}

	public void checkException(String firstName, String lastName) {
		try {
			if (firstName.equals(" ") && lastName.equals(" ")) {
				System.out.println("Entry Missing");
			} else if (firstName.length() < 3 && lastName.length() < 3) {
				try {
					throw new NameException();
				} catch (NameException e) {
					System.out.println("Name should be minimum 3 character");
				}
			} else {
				System.out.println("Name:" + firstName + " " + lastName);
			}
		} catch (NullPointerException e) {
			System.out.println("Entry missing");
		}
	}
}
