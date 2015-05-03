#include <stdio.h>

int is_unique(char* str) {
     	if(str == NULL) {
		return 1;
	}
	int checker = 0;
	char* p = str;
	while (*p != '\0') {
		int temp = *p - 'a';
		if ((checker & (1 << temp)) != 0) {
			return -1;
		}
		checker = checker | (1 << temp);
		p++;
	}
	return 1;
}

int main() {
	char* s = "abcade";
	if(is_unique(s) > 0) {
		printf("all are unique\n");
	} else {
		printf("some char duplicates\n");
	}
	
	char* s2 = "abcdefg";
        if(is_unique(s2) > 0) {
                printf("all are unique\n");
        } else {
                printf("some char duplicates\n");
        }
	return 0;
}
