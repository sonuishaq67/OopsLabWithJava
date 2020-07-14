package com.msrit.problem12;

import java.util.Scanner;

public class LLOfString {

	Node head;

	static class Node {

		String data;
		Node next;

		Node(String d) {
			data = d;
			next = null;
		}
	}

	public static LLOfString insert(LLOfString list, String data) {
		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		return list;
	}

	static Node InsertPos(Node headNode, int position, String data) {
		Node head = headNode;
		if (position < 1)
			System.out.print("Invalid position");

		if (position == 1) {
			Node newNode = new Node(data);
			newNode.next = headNode;
			head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					Node newNode = new Node(data);
					newNode.next = headNode.next;
					headNode.next = newNode;
					break;
				}
				headNode = headNode.next;
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return head;
	}

	public static void printList(LLOfString list) {
		Node currNode = list.head;

		System.out.print("\nLLOfString: ");

		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}
		System.out.println("\n");
	}

	public static LLOfString deleteByKey(LLOfString list, String key) {
		Node currNode = list.head, prev = null;

		if (currNode != null && currNode.data == key) {
			list.head = currNode.next;

			System.out.println(key + " found and deleted");

			return list;
		}

		while (currNode != null && !currNode.data.equals(key)) {
			prev = currNode;
			currNode = currNode.next;
		}

		if (currNode != null) {
			prev.next = currNode.next;

			System.out.println(key + " found and deleted");
		}

		if (currNode == null) {
			System.out.println(key + " not found");
		}
		return list;
	}

	public static LLOfString deleteAtPosition(LLOfString list, int index) {
		Node currNode = list.head, prev = null;
		if (index == 0 && currNode != null) {
			list.head = currNode.next;
			System.out.println(index + " position element deleted");
			return list;
		}

		int counter = 0;

		while (currNode != null) {

			if (counter == index) {
				prev.next = currNode.next;

				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}

		if (currNode == null) {
			System.out.println(index + " position element not found");
		}

		return list;
	}

	public static void main(String[] args) {
		LLOfString list = new LLOfString();
		int n = 0;
		Scanner scan = new Scanner(System.in);
		while (n != 5) {
			System.out.println("1)Insert a element to linked list");
			System.out.println("2)Insert a element at a position");
			System.out.println("3)Delete by key ");
			System.out.println("4)Delete at a position");
			System.out.println("5)Quit\nEnter an option");
			n = scan.nextInt();
			if (n == 1) {
				System.out.println("Enter a String to insert");
				scan.nextLine();
				String data = scan.nextLine();
				insert(list, data);
			} else if (n == 2) {
				System.out.println("Enter the position");
				int pos = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the string");
				String data = scan.nextLine();
				InsertPos(list.head, pos, data);
			} else if (n == 3) {
				System.out.println("Enter the element to delete");
				scan.nextLine();
				String key = scan.nextLine();
				deleteByKey(list, key);
			} else if (n == 4) {
				System.out.println("Enter the position");
				int pos = scan.nextInt();
				deleteAtPosition(list, pos);
			}
		}
		scan.close();
		printList(list);
	}
}
