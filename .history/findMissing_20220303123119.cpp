#include <iostream>
#include <vector>

using namespace std;

 findMiss(vector<int> &nums)
{
    int n = nums.size();
    int original_sum = ((1 + n) * n) / 2;
    int original_sum_squared = n * (n + 1) * (2 * n + 1) / 6;
    int given_sum = 0;
    int given_sum_squared = 0;
    for (int i = 0; i < n; ++i)
    {
        given_sum += nums[i];
        given_sum_squared += nums[i] * nums[i];
    }
    int repeat_minus_miss = given_sum - original_sum;                                      // m - n
    int repeat_plus_miss = (given_sum_squared - original_sum_squared) / repeat_minus_miss; // (m^2 - n^2) / (m - n) = (m + n)
    int repeat = (repeat_minus_miss + repeat_plus_miss) / 2;
    int miss = repeat_plus_miss - repeat;
    c << miss << endl;
    cout << repeat << endl;
}
int main()
{
    vector<int> nums = {3, 1, 2, 6, 4, 2};
    findMiss(nums);
}