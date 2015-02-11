/*
 * Chapter1_3.c
 *
 *  Created on: 2015-2-11
 *      Author: Chris
 *
 *      Design an algorithm and write code to remove the duplicate characters in a string
 *      without using any additional buffer. NOTE: One or two additional variables are fine.
 *      An extra copy of the array is not.
 *      FOLLOW UP
 *      Write the test cases for this method.
 */

#include <stdio.h>

void remove_dup_char(char* str) {
	if(!str) {
		return;
	}

	char* p = str;
	p++;
	char* tail = p;
	while(*p) {
		char* q = str;
		while (q < tail) {
			if (*p == *q) {
				break;
			}
			q++;
		}
		if (q == tail) {
			*q = *p;
			tail = q + 1;
		}
		p++;
	}
	*tail = 0;

}

int main() {
	char test[] = "abcdaefb";
	remove_dup_char(test);
	printf("remove dup result = %s\n",test);

	char test1[] = "abcd";
	remove_dup_char(test1);
	printf("remove dup result = %s\n",test1);

	char test2[] = "aaabcd";
	remove_dup_char(test2);
	printf("remove dup result = %s\n",test2);

	char test3[] = "";
	remove_dup_char(test3);
	printf("remove dup result = %s\n",test3);
}


