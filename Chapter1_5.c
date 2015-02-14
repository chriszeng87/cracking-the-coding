/*
 * Chapter1_5.c
 *
 *  Created on: 2015-2-14
 *      Author: Chris
 *
 *      Write a method to replace all spaces in a string with ‘%20’.
 */

#include <stdio.h>
#include <string.h>

void replace_spaces(char* str) {
	if (!str) {
		return;
	}
	int spacesCount = 0;
	int len = strlen(str);
	int i = 0;
	char* p = str;
	while (*p != '\0') {
		if (*p == ' ')
			spacesCount++;
		p++;
	}

	str[strlen(str) + 2 * spacesCount] = '\0';

	i = strlen(str) + 2 * spacesCount - 1;
	p = str + len -1;
	while (p >= str) {
		if (*p != ' ') {
			str[i--] = *p;
		} else {
			str[i--] = '0';
			str[i--] = '2';
			str[i--] = '%';
		}
		p--;
	}
	printf("replace_spaces 2\n");
}

int main() {
	char test[] = "abc e";
	replace_spaces(test);
	printf("The reslut is %s\n",test);

	char test1[] = "abc";
	replace_spaces(test1);
	printf("The reslut is %s\n",test1);

	char test2[] = "ab  c";
	replace_spaces(test2);
	printf("The reslut is %s\n",test2);

	char test3[] = "  ab  c";
	replace_spaces(test3);
	printf("The reslut is %s\n",test3);
	//will report Abort trap after print. Anything wrong with the end '\0'?

	return 0;
}



