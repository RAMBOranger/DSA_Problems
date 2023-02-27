//program: print butterfly pattern

#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;

    for(int i=0; i<n; i++)//for 1st and 2nd sub part
    {
        //first part(star with space)
        for(int j=0; j<i; j++)
        {
            cout<<"*";
        }
        for(int j=0; j<n-i; j++)
        {
            cout<<" ";
        }

        //second part(spaces with stars)
        for(int j=0; j<n-i; j++)
        {
            cout<<" ";
        }
         for(int j=0; j<i; j++)
        {
            cout<<"*";
        }
        cout<<endl;

    } 

    //for 3rd and 4th sub part
     for(int i=0; i<n; i++)//for 1st and 2nd sub part
    {
        //third part(star with space)
        for(int j=0; j<n-i; j++)
        {
            cout<<"*";
        }
        for(int j=0; j<i; j++)
        {
            cout<<" ";
        }

        //fourth part(spaces with stars)
        for(int j=0; j<i; j++)
        {
            cout<<" ";
        }
         for(int j=0; j<n-i; j++)
        {
            cout<<"*";
        }
        cout<<endl;

    } 
    return 0;
}