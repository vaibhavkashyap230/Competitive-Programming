#include<stdio.h>
#include<iostream>
#include<string>
using namespace std;
int main()
{
    string s;
    cin>>s;
    for(int i=0;i<s.length();i++)
    {
        s[i]=(int)s[i];
    }
    int i=0;
    int c=0;
    int cmax=0;
    for(i=0;i<s.length();i++)
    {
        if(s[i]==65 ||s[i]==69 || s[i]==73 || s[i]==79 || s[i]==85 || s[i]==97 || s[i]==101 || s[i]==105 || s[i]==111 || s[i]==117)
        {
            c=c+1;
            if(c>cmax)
            cmax=c;
        }
        else
        {
            c=0;
        }
    }
    cout<<cmax;
    return(0);
}
