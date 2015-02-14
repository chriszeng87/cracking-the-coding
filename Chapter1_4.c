/*
 * Chapter1_4.c
 *
 *  Created on: 2015-2-14
 *      Author: Chris
 *
 *   Write a method to decide if two strings are anagrams or not.
 */

#include <stdio.h>
#include <string.h>

void getCount(const char* str,int* count, int countLength) {
	int len = strlen(str);
	int index = 0;
	while (index < len) {
		count[*(str + index) - '0']++;
		index++;
	}
}

int isAnagrams(const char* str1, const char* str2) {
	if (!str1) {
		if (!str2) {
			return 1;
		} else {
			return 0;
		}
	} else if (!str2) {
		return 0;
	}

	if (strlen(str1) != strlen(str2)) {
		return 0;
	}

	int count1[256] = {0};
	int count2[256] = {0};
	getCount(str1, count1, 256);
	getCount(str2, count2, 256);
	int i = 0;
	for ( ; i < 256; i++) {
		if (count1[i] != count2[i]) {
			return 0;
		}
	}
	return 1;
}

int main() {
	char test11[] = "lee";
	char test12[] = "eel";
	int result = isAnagrams(test11, test12);
	if (result > 0) {
		printf("test11 is test12's anagram \n");
	} else {
		printf("test11 is not test12's anagram \n");
	}

	char test21[] = "listen";
	char test22[] = "silent";
	result = isAnagrams(test21, test22);
	if (result > 0) {
		printf("test21 is test22's anagram \n");
	} else {
		printf("test21 is not test22's anagram \n");
	}

	char test31[] = "listen";
	char test32[] = "silemt";
	result = isAnagrams(test31, test32);
	if (result > 0) {
		printf("test31 is test32's anagram \n");
	} else {
		printf("test31 is not test32's anagram \n");
	}
}



