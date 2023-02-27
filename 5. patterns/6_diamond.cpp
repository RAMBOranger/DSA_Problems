#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    for(int i=1; i<=n; i++)
    {
        //for space (1st section)
        for(int j=1; j<=n-i; j++)
        {
            cout<<" ";
        }
        //for star(1st section)
         for(int j=1; j<=i; j++)
        {
            cout<<"*";
        }
        //for star(2nd section)
         for(int j=1; j<=i; j++)
        {
            cout<<"*";
        }

       cout<<endl;
       }

       //for 3rd section new for loop
       for(int l=1;l<=n;l++)
       {
                 //for space(3rd section)
                for(int j=1; j<=l; j++)
                {
                    cout<<" ";
                }
                 //for star(3rd section)
                for(int j=1; j<=n-l; j++)
                 {
                   cout<<"*";
                 }
                   //for star(4th section)
                for(int j=1; j<=n-l; j++)
                {
                    cout<<"*";
                }
                 //for space(4th section)
                for(int j=1; j<=l; j++)
                 {
                   cout<<" ";
                 }
                 cout<<endl;
        }

    return 0;
}