// program 4. remove the duplicate characters from the given string.

package String_Work;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    static void removeDuplicates(String str)
    {
    //  //------------------this is not working---------------
    //    // make a hashset (since it contains only unique elements)
    //     HashSet<Character> set=new HashSet<>();

    //     for(int i=0;i<str.length();i++) 
    //     {
    //         set.add(str.charAt(i));           

    //     }  
        
    //     //print the 
    //     for (Character character : set) {
    //         System.out.print(character);
    //     }
       
        

//----------------------------------------working-----------------------
          //Create LinkedHashSet of type character   
          LinkedHashSet<Character> set = new LinkedHashSet<>();   
          //Add each character of the string into LinkedHashSet   
          for(int i=0;i<str.length();i++)   
              set.add(str.charAt(i));   
              
          // print the string after removing duplicate characters   
          for(Character ch : set)   
              System.out.print(ch);   
    }
    public static void main(String[] args) {
        String str="rahull is a student";

        removeDuplicates(str);
    
    }
}
