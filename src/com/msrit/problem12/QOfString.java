/*Write a java program to implement queues of Strings using an ArrayList class of the
Collection framework.*/
package com.msrit.problem12;

import java.util.ArrayList;
import java.util.Scanner;

public class QOfString {
	static ArrayList<String> queue = new ArrayList<String>();
	static int front = 0;
	static int rear = 0;
	static int capacity = 5;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		while (n != 5) {
			System.out.println("Enter one of the option");
			System.out.println("1)Enqueue\n2)Dequeue\n3)Show queue\n4)Peek5)Quit");
			n = scan.nextInt();
			if (n == 1) {
				System.out.println("Enter a string");
				scan.nextLine();
				String x = scan.nextLine();
				Enqueue(x);
			} else if (n == 2) {
				System.out.println("The element dequeued is " + Dequeue());
			} else if (n == 3) {
				showQ();
			}
			else if (n==4) {
				System.out.println("The element on the front is "+peek());
			}
		}
		scan.close();
	}

	static void Enqueue(String x) {
		if (isFull()) {
			System.out.println("The queue is full hence value will not be added");
		} else {
			queue.add(x);
			rear++;
		}
	}

	static String peek() {
		return queue.get(front);
	}

	static String Dequeue() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return null;
		}
		String x = queue.get(front);
		front++;
		return x;
	}

	static void showQ() {
		if (isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println("The elements of the Queue:");
			for (int i = front; i < rear; i++)
				System.out.println("\t" + queue.get(i));
		}
	}

	private static boolean isFull() {
		if (rear == capacity)
			return true;
		return false;

	}

	private static boolean isEmpty() {
		if (rear == front)
			return true;
		return false;
	}
}
