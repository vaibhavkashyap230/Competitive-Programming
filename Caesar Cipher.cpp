#include <bits/stdc++.h>
using namespace std;
int main()
{
  int i=0;
  int k,n;
  cin>>n;
  string s;
  cin>>s;
  cin>>k;
  k = k % 26;
  for (i = 0; i < n; i++)
  {
    s[i] = (int)s[i];
    s[i]-=50;
    if (s[i] >= 15 && s[i] <= 40)
    {
      s[i] += k;
      if(s[i]>40)
      {
        s[i]-=26;
      }
    }
    if (s[i] >= 47 && s[i] <= 72) 
    {
      s[i]=s[i]+k;
    
      if( s[i] > 72 )
      {
        s[i]-=26;
      }
    }
    s[i]+=50;
    s[i] = (char)s[i];
  }
    cout << s;
    return(0);
}
