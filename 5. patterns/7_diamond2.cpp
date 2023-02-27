//pattern: ******kaju katli******
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;

    // 1st part(upper equilateral)
    for(int i=1; i<=n; i++)//row
    {
        for(int j=1; j<=n-i; j++)// spaces
        {
            cout<<" ";
        }
        for(int k=1; k<=i; k++)//stars
        {
            cout<<"* ";
        }
        cout<<endl;
    }
    // 2nd part (downward equilateral)
     for(int i=1; i<=n; i++)//row
    {
        for(int j=1; j<=i; j++)// spaces
        {
            cout<<" ";
        }
        for(int k=1; k<=n-i; k++)//stars
        {
            cout<<"* ";
        }
        cout<<endl;
    }
    return 0;
}