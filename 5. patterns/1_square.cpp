//square pattern

#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;

    for(int i=0; i<n; i++) //for rows
    {
        for(int j=0;j<n; j++) //for each row there are n coloumns
        {
            cout<<"* ";
        }
        cout<<endl;
    }
    return 0;
}