#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;

  for(int i=1; i<=n; i++)//for rows
    {
        if(i==1  || i==n)// for initial and last row's star
        {
            for(int j=1; j<=i; j++)
            {
                cout<<"*";
            }
        }
        else //for middle sector, stars with spaces
        {
            cout<<"*";
        for(int k=1 ; k<=i-2; k++)// space print
        {
            cout<<" ";
        }
         cout<<"*";
        }
        cout<<endl;
    }

    return 0;
}