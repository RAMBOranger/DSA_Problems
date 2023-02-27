#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    for(int i=1; i<=n; i++)//row
    {
        //for spaces
        for(int j=1; j<=i; j++)
        {
        cout<<" ";
        }
        //for stars
         for(int k=1; k<=n-i+1; k++)
        {
        cout<<"* ";
         }
          cout<<endl;
    }
    
   
    return 0;
}