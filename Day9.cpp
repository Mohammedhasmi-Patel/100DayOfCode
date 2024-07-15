#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// this is most important question.
void subSequence(int arr[], int index, int size, vector<vector<int>> &ans, vector<int> temp)
{
  // base condition
  if (index == size)
  {
    ans.push_back(temp);
    return;
  }
  // not include
  subSequence(arr, index + 1, size, ans, temp);

  // include
  temp.push_back(arr[index]);
  subSequence(arr, index + 1, size, ans, temp);
}

int main()
{
  int arr[] = {1, 2, 3};
  vector<vector<int>> ans;
  vector<int> temp;
  subSequence(arr, 0, 3, ans, temp);
  cout << "Hello " << endl;

  for (int i = 0; i < ans.size(); i++)
  {
    for (int j = 0; j < ans[i].size(); j++)
    {
      cout << ans[i][j] << " ";
    }
    cout << endl;
  }

  return 0;
}