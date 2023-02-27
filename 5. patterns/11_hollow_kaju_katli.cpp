#include<bits/stdc++.h>
using namespace std;
int main()
{ int n;
  cin>>n;

  for(int i=1; i<=n; i++) //for 1st and 2nd part row
  {
    //for 1st part space 
    for(int j=1; j<=n-i; j++)
    {
        cout<<" ";
    }
    //for 1st part star with space
    cout<<"*";
    for(int k=1; k<=i-1; k++)
    {
        cout<<" ";
    }
    
    //for 2nd part spaces with star
    for(int l=1;l<=i-1; l++)
    {
        cout<<" ";
    }
    cout<<"*";

    cout<<endl;
  }
  for(int i=1; i<=n;i++) //for 3rd and 4th part rows
  {
    //for 3rd part spaces with star
    for(int j=1; j<=i-1;j++)
    {
        cout<<" ";
    }
    cout<<"*";
    for(int k=1; k<=n-i; k++) //for 3rd part space
    {
        cout<<" ";
    }
    //for 4th part
    for(int l=1;l<=n-i;l++)
    {
        cout<<" ";
    }
    cout<<"*";
    cout<<endl;

  }
  
    return 0;
}