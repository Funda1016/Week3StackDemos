package StackDemo;

import java.util.Stack;

public class Deneme {

	public static void main(String[] args) {
		Stack<String>myStack3=new Stack<>();
		myStack3.push("Red");
		myStack3.push("Yellow");
		myStack3.push("White");
		System.out.println(myStack3);
		System.out.println(myStack3.size());
		System.out.println(myStack3.pop());//pop en usttekini aliyor
		System.out.println(myStack3);
		System.out.println(myStack3.peek());
		System.out.println(myStack3);
		Stack<Car>myStack2=new Stack<>();
		myStack2.push(new Car());
		myStack2.push(new Car("Rod",2000));
		myStack2.push(new Car("White",1000));
		myStack2.push(new Car("Yellow",3000));
		System.out.println(myStack2.pop());
		System.out.println(myStack2);
		System.out.println(myStack2.peek());
		myStack2.peek();
		Stack<Integer>nums=new Stack<>();
		nums.push(3);
		nums.push(5);
		nums.push(7);
		nums.push(9);
		System.out.println(nums);
		System.out.println(nums.size());
		System.out.println(nums.peek());
		System.out.println(nums.pop());
		System.out.println(nums);
		System.out.println(nums.search(5));
		
		
		
		
	}

}
