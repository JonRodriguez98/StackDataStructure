/*
 * Jon Rodriguez
 * February 25 2022
 * This program uses user inputs to change numbers in an integer array, 
 * as well as display the numbers in the array in different ways.
 */

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		int choice;
		Scanner input = new Scanner(System.in);
		
		//Main menu do while loop
		do {
			System.out.println("Please enter the menu number for the action you want to perform on the stack");
			System.out.println("1. Print elements in the stack");
			System.out.println("2. Push an element to stack");
			System.out.println("3. Pop an element from stack");
			System.out.println("4. Count the number of elements in stack");
			System.out.println("5. Peek to check the top most element");
			System.out.println("6. Quit");
			
			choice = input.nextInt();

			// conditional statements depending on the menu option selected

			// if statement if true will call display method
			if (choice == 1) {
				if (stack.isEmpty()) {
					System.out.println("Error : The stack is empty");

				}

				else {
					stack.display();
				}
			}
			/*
			 * else if statement will ask user to input value to add to array and call the
			 * push method
			 */
			else if (choice == 2) {

				System.out.println("Insert value to add to stack");

				int push = input.nextInt();
				stack.push(push);
			}

			/*
			 * else if user inputs 3 it will call pop method to remove the last value
			 * inputed by user into the array
			 */
			else if (choice == 3) {
				stack.pop();
			}

			/*
			 * else if user inputs 4 it will count the number of values in the array
			 */
			else if (choice == 4) {
				stack.count();
			}

			/*
			 * else if user inputs 5 it will find the top number in the array
			 */
			else if (choice == 5) {
				stack.peek();
			}
		}
		/*
		 * if user inputs 6 it will quit the menu application
		 */
		while (choice != 6);

		System.out.println("Thank you for using the application!");

		input.close();
	}

}
