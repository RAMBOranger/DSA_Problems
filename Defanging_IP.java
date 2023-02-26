// program 1. Defanging the ip address

package String_Work;

import java.util.Scanner;

public class Defanging_IP
{

//method for changing the ip to defanged ip
static String defangedIp(String str)
{
    String temp="";

    for(int i=0; i<str.length(); i++)
    {
        
        if(str.charAt(i)=='.')
        {
            temp+="[.]";
        }
        else{
            temp+=str.charAt(i);
        }
    }
    return temp;
}

//main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String result=defangedIp(str);
        System.out.println("result is: "+result);
        sc.close();
        

        
    }
}