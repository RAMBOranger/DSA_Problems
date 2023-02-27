//pattern: Hollow inverted half pyramid
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    for(int i=1;i<=n; i++)
    {
        //for 1st and last line
        if(i==1 || i==n)
        {
            for(int j=1; j<=n-i+1;j++)
            {
                cout<<"*";
            }
        }
        else //for middle stars with spaces
        {
            cout<<"*";
             for(int k=1 ; k<=n-i-1; k++ ) //spaces print
        {
            cout<<" ";
        }
            cout<<"*";

        }

       cout<<endl; //after each row new line
       
    }
    return 0;
}

    
