// program 2. find the no. of occurances of character in the given string
package String_Work;

public class Occurances {
    public static int countOccurances(String str, char ch)
    {
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==ch)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str="rasshaula";
        char ch='a';
        int count=countOccurances(str,ch);
        System.out.println(count);

    }
}
