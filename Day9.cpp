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

// print all string subsequence
int stringSubsequence(string str, string output[])
{
  if (str.length() == 0)
  {
    output[0] = "";
    return 1;
  }

  int smallerOutputSize = stringSubsequence(str.substr(1), output);
  for (int i = 0; i < smallerOutputSize; i++)
  {
    output[i + smallerOutputSize] = str[0] + output[i];
  }
  return 2 * smallerOutputSize;
}

int main()
{
  // int arr[] = {1, 2, 3};
  // vector<vector<int>> ans;
  // vector<int> temp;
  // subSequence(arr, 0, 3, ans, temp);
  // cout << "Hello " << endl;

  // for (int i = 0; i < ans.size(); i++)
  // {
  //   for (int j = 0; j < ans[i].size(); j++)
  //   {
  //     cout << ans[i][j] << " ";
  //   }
  //   cout << endl;
  // }

  string output[100];
  int size = stringSubsequence("abcd", output);
  for (int i = 0; i < size; i++)
  {
    cout << output[i] << endl;
  }

  return 0;
}