//============================================================================
// Name        : sqrt_x.cpp
// Author      : zhipeng.czp
// Version     :
// Copyright   : czpthegreat@gmail.com
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Solution {
public:
	int sqrt(int x) {
		long long tmp = x;	// for the case x=2147395599
		return bsearch(tmp, 0, tmp);
	}

	int bsearch(long long x, long long beg, long long end) {
		long long mid = (beg + end) / 2;
		if (isSqrt(x, mid)) {
			return mid;
		} else if (mid * mid > x) {
			return bsearch(x, beg, mid - 1);
		} else {
			return bsearch(x, mid + 1, end);
		}
	}

	int isSqrt(long long x, long long r) {
		if (r * r == x) {
			return 1;
		} else if (r * r < x && (r + 1) * (r + 1) > x) {
			return 1;
		} else {
			return 0;
		}
	}
};

int main() {
	Solution s;

	cout << s.sqrt(2147395599) << endl;

	return 0;
}
