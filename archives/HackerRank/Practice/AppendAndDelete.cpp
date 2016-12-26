/* https://www.hackerrank.com/challenges/append-and-delete */

#include <iostream>

using namespace std;

int getMinimumMoves(string& str1, string& str2) {
	int s1len = str1.length();
	int s2len = str2.length();

	int minimumMoves = s1len + s2len;
	
	int i = 0;
	while(i<s1len && i<s2len) {
		if(str1[i] != str2[i]) break;
		minimumMoves -= 2;
		i++;
	}

	return minimumMoves;
}

int main() {
	string str1, str2;
	cin >> str1 >> str2;
	int k; cin >> k;

	int s1len = str1.length();
	int s2len = str2.length();

	int deletRewriteMoves = s1len + s2len;
	int minimumMoves = getMinimumMoves(str1, str2);

	if (k < minimumMoves) cout << "No" << endl;
	else if ((k - minimumMoves) % 2 == 0) cout << "Yes" << endl;
	else if (k >= deletRewriteMoves) cout << "Yes" << endl;
	else if (k <  deletRewriteMoves) cout << "No"  << endl;
}

