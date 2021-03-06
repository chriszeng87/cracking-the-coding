#include <iostream>
#include <stddef.h>
/* Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed? */

class Node {

private:
	Node next = NULL;
	int data;

public:
	Node(int d)
	{
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != NULL) {
			n = n.next;
		}
		n.next = end;
	}

	Node deleteNode(Node head, int d) {
		Node n = head;
		if (n.data == d) {
			return head.next; /* moved head */
		}
		while (n.next != NULL) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head; /* head didn’t change */
			}
			n = n.next;
		}
	}
};



int main() {
	Node root(1);
	return 0;
}
