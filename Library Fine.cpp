 #include <bits/stdc++.h>
using namespace std;
int main()
{
    int d1,d2,m1,m2,y1,y2;
    cin>>d2>>m2>>y2;
    cin>>d1>>m1>>y1;
    if(y2>y1)
    {
        cout<<"10000";
    }
    else if (y2==y1 && m2>m1)
    {
        int f=(m2-m1)*500;
        cout<<f;
    }
    else if ( y2==y1 && m2==m1 && d2>d1)
    {
        int f=(d2-d1)*15;
        cout<<f;
    }
    else
    {
        cout<<"0";
    }
}
