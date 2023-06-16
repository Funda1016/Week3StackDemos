package StackDemo;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		/*
		 * Stack<String>myStack=new Stack<>(); myStack.push("red");
		 * myStack.push("Green"); myStack.push("Blue"); System.out.println(myStack);
		 * System.out.println(myStack.size()); System.out.println(myStack.pop());
		 * System.out.println(myStack.pop()); System.out.println(myStack.peek());
		 * 
		 * Stack<Integer> myStack2=new Stack<>(); myStack2.push(3); myStack2.push(5);
		 * myStack2.push(7); myStack2.push(9); myStack2.push(7);
		 * System.out.println(myStack2); System.out.println(myStack2.size());
		 * System.out.println(myStack2.pop()); System.out.println(myStack2);
		 * System.out.println(myStack2.peek()); System.out.println(myStack2);
		 * System.out.println(myStack2.search(9))
		 */;
		Stack<String>myStack3=new Stack<>();
		myStack3.push("Red");
		myStack3.push("Yellow");
		myStack3.push("White");
		System.out.println(myStack3);
		System.out.println(myStack3.size());
		System.out.println(myStack3.pop());
		System.out.println(myStack3.peek());
		System.out.println(myStack3);
		Stack<Car>myStack4=new Stack<>();
		myStack4.push(new Car());
		myStack4.push(new Car("Rod",2000));
		myStack4.push(new Car("gm",20007));
		System.out.println(myStack4);
				
		
	}

}
