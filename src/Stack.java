/*
 * Jon Rodriguez
 * February 25 2022
 * This class uses user inputs to change numbers in an integer array, as well
 * as display the numbers in the array in different ways.
 */
public class Stack {
	
	//array list
	int[] stackArray = new int[5];
	//attributes
	int top = -1;
	
	/*
	 * method : checks if the array is empty
	 * params : none
	 * return : true or false depending if array is empty or not
	 */
	boolean isEmpty() {

		if (top < 0) {
			return true;
		}

		else {
			return false;
		}
	}

	/*
	 * @method : checks if the array is full
	 * @params : none
	 * @return : true or false depending if array is full or not
	 */
	boolean isFull() {

		if (top == this.stackArray.length - 1) {
			return true;
		}

		else {
			return false;
		}
	}

	/*
	 * @method : Adds a number to the top of the array
	 * @params : uses the integer inputed by the user as a parameter
	 * @return : if true, adds the value to the top of the array and returns 
	 * true with confirmation message. If false, sends error message and 
	 * returns false
	 * 
	 */
	boolean push(int a) {

		if (this.isFull()) {
			System.out.println("Error : The Array is full!");
			return false;
		}

		else {
			top+=1;
			this.stackArray[top] = a;
			System.out.println("The value has been added");
			return true;
		}
	}

	/*
	 * @method : removes a number from the top of the array
	 * @params : none
	 * @return : if the array is full it returns error message and returns 
	 * value of 0. If array is not full, replaces the number from the top
	 * and decrements the index
	 */
	int pop() {

		if (this.isEmpty()) {
			System.out.println("Error : the stack is empty");
			return 0;
		}

		else {
			return this.stackArray[top--] = 0;		
		}
	}

	/*
	 * @method : provides the number of values in the array
	 * @params : none
	 * @return : returns the amount of values in the array
	 */
	int count() {
		
		int count = 1 + top;
		System.out.println("total values in the array is " + count);
		return count;
	}

	/*
	 * @method : provides the value of the top number inputed last by user
	 * returns 0 if array is empty.
	 * @params : none
	 * @return : returns the top number inputed last by user. Returns 0 if
	 * array is empty.
	 */
	int peek() {

		if (top < 0) {
			return 0;
		}

		else {
			System.out.println(this.stackArray[top]);
			return this.stackArray[top];
		}
	}

	/*
	 * @method : This method prints all numbers within the array in LIFO order
	 * @params : none
	 * @return : does not return any value
	 */
	void display () {
		for(int i = top; i >= 0; i--) {
			System.out.println(this.stackArray[i]);
		}
	}
}
