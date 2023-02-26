// program 5. reverse the given string.

package String_Work;

public class String_Reversal {

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
        String str="rahul";
         
       String result=stringReversal(str);
        
        System.out.println(result);
    }
}
