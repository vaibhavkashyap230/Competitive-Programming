#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n,k;
    cin>>n>>k;
    int a[n];
    int i=0;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    i=0;
    int e=100;
    do
    {
        i=(i+k)%n;
        e-=1;
        if(a[i]==1)
        {
            e-=2;
        }
    }
    while(i!=0);
    cout<<e;
    return(0);
}
