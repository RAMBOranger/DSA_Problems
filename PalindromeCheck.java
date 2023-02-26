// program 3. check that given string is palindrome or not

package String_Work;

public class PalindromeCheck {
    public static String stringReversal(String str)
    {
       String newstr="";
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch=str.charAt(i);
            newstr=ch+newstr;
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="radaro";
         
        String result=stringReversal(str);
   
        if(str.equals(result))
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");

         
    }
}
