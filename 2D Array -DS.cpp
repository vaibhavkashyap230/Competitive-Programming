#include<bits/stdc++.h>
#include<iostream>
using namespace std;
int main()
{
    int a[6][6];
    for(int i=0;i<6;i++)
    {
        for(int j=0;j<6;j++)
        {
            cin>>a[i][j];
        }
    }
    int sumf=0;
    int max=0;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            int sum1=0;
            int sum2=0;
            for(int k=j;k<j+3;k++)
            {
                sum1=sum1+a[i][k];
                sum2=sum2+a[i+2][k];
            }
            sumf=sum1+sum2+a[i+1][j+1];
        if(sumf>max)
        max=sumf;
        }
    }
    cout<<max;
    return 0;
}
