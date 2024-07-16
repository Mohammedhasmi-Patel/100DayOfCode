#include <iostream>
#include <bits/stdc++.h>

using namespace std;
void parent(int n, int left, int right, vector<string> &ans, string &temp)
{
  if (left + right == 2 * n)
  {
    ans.push_back(temp);
    return;
  }

  // left
  if (left < n)
  {
    temp.push_back('(');
    parent(n, left + 1, right, ans, temp);
    temp.pop_back();
  }

  // right
  if (right < left)
  {
    temp.push_back(')');
    parent(n, left, right + 1, ans, temp);
    temp.pop_back();
  }
}
int main()
{

  return 0;
}