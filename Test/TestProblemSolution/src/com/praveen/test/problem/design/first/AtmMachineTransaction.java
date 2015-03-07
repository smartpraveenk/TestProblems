package com.praveen.test.problem.design.first;

import java.util.Scanner;

public class AtmMachineTransaction {

	public static int amount = 0;

	public static void main(String args[]) {
		Scanner keyboard = null;
		try{
		keyboard = new Scanner(System.in);
		AtmMachineTransaction atm = new AtmMachineTransaction();
		String userID = "";
		String password = "";
		System.out.print("User ID: ");
		userID = keyboard.nextLine();

		System.out.print("Password: ");
		password = keyboard.nextLine();

		boolean validUser = false;
		if (!userID.equals("") && !password.equals(""))
			validUser = atm.authenticate(userID, password);

		if (validUser) {
			System.out.println("Hello " + userID);
			System.out.println("What would you like to do?");
			int choice = 0;

			while (choice != 4) {
				choice = menu();

				switch (choice) {
				case 1:
					System.out.print("Enter amount to deposit? :");
					int sum = keyboard.nextInt();
					if (sum == 0) {
						System.out.print("Wrong amount.");
						System.out.println();
						System.out.println();
					} else {
						deposit(sum);
					}
					break;
				case 2:
					System.out.print("Withdrawl amount : ");
					sum = keyboard.nextInt();
					if (sum == 0) {
						System.out.print("Wrong amount.");
						System.out.println();
						System.out.println();
					} else {
						if (sum > amount) {
							System.out.println("Insufficicent Balance.");
							break;
						}
						withdraw(sum);
					}
					break;
				case 3:
					showBalance();
					break;
				case 4:
					System.out.println("You chosed to end ");
					break;
				}
			}

		}

		else{
			System.out.println("Sorry Invalid UserId or Password");
		}
			
			
	} catch (Exception e) {
		// log exception
	} finally {
		if (keyboard != null) {
			keyboard.close();
		}
	}

	}

	private static void withdraw(int sum) {
		amount = amount - sum;
	}

	private static void deposit(int sum) {
		amount = amount + sum;
	}

	public boolean authenticate(String userID, String password) {

		if (userID.equals("1234") && password.equals("1234"))
			return true;
		else
			return false;
	}

	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;

		System.out.println("1. Deposit ");
		System.out.println("2. Withdrawl ");
		System.out.println("3. Balance ");
		System.out.println("4. End ");
		System.out.println();

		System.out.println("Your choice ");
		choice = keyboard.nextInt();
		return choice;
	}

	public static void showBalance() {
		System.out.println("Available balance : " + amount);

	}
}