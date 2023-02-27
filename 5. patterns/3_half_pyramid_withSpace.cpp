//pattern: half pyramid with space
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;

    for(int i=1; i<=n; i++)//row
    {
        for(int j=1; j<=n-i; j++)//for space
        {
            cout<<" ";
        }
        for(int k=1; k<=i; k++)//for *
        {
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}