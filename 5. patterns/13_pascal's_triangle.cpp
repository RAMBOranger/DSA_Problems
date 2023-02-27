//program: print pascals triangle   ????????????????????????
// logic wise good but not for big integers
//issue hai chl ni rha but concept thik hai

#include<bits/stdc++.h>
using namespace std;

int fact(int n)
{
    if(n==1 || n==0)
    return 1;
    else 
    return n*fact(n-1);

    //without recursion
    /* int ans=1;
    while(n)
    {
        ans=ans*n;
        n--;
    }
    return ans; */
}

int nCr (int n, int r)
{
    int val1=fact(n);
     int val2=fact(n-r);
      int val3=fact(r);

      int ans= (val1)/(val2 * val3);
        return ans;
}
int main()
{
    int n;
    cin>>n;

    for(int i=1; i<=n; i++)// for row 
    {
        for(int j=1; j<=i; j++)//for col
        {
            int val=nCr(i,j);
            cout<<val<<" ";
        }
        cout<<endl;
    }
    return 0;
}