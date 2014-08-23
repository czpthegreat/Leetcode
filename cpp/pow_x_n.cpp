//============================================================================
// Name        : pow_x_n.cpp
// Author      : zhipeng.czp
// Version     :
// Copyright   : czpthegreat@gmail.com
// Description : for the problem at https://oj.leetcode.com/problems/powx-n/
//============================================================================

#include <iostream>
using namespace std;

class Solution {
public:
	double pow(double x, int n) {
		double result;

		if (n == 0) {
			result = 1;
		} else if (n > 0) {
			result = positive_pow(x, n);
		} else {
			/**
			 * long long variable for the case x=1, n=-2147483648
			 */
			long long m = n;
			m *= -1;
			result = 1 / positive_pow(x, m);
		}

		return result;
	}

	double positive_pow(double x, long long n) {
		cout << "x=" << x << ",n=" << n << endl;
		if (n == 1) {
			return x;
		} else {
			double tmp = positive_pow(x, n / 2);

			if (n % 2 == 0) {
				return tmp * tmp;
			} else {
				return tmp * tmp * x;
			}
		}
	}
};

int main() {
	Solution s;

	cout << s.pow(34.00515, -3) << endl;

	return 0;
}
