/*
 * Chapter1_2.c
 *
 *  Created on: 2015-2-11
 *      Author: Chris
 */
#include <stdio.h>
#include <string.h>

void reverse_string(char* str) {
	if (str == NULL) {
		return;
	}
	char* end = str;
	while (*end) {
		end++;
	}
	end--;
	char* start = str;
	char tmp;
	while (start < end) {
		tmp = *start;
		*start = *end;
		*end = tmp;
		start++;
		end--;
	}

}

int main() {
	char test[] = "abcdef";
	reverse_string(test);
	printf("reverse string result = %s\n",test);

	char test2[] = "abcde";
	reverse_string(test2);
	printf("reverse string result = %s\n",test2);

	char test3[] = "";
	reverse_string(test3);
	printf("reverse string result = %s\n",test3);

	reverse_string(NULL);
}
