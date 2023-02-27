//```````clone()```` 
//clone() method returns a shallow copy of this LinkedList.

package Practice;

import java.util.LinkedList;

public class ll_clone_method {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("rahul");
        list.add("ramesh");
        list.add("rohan");
        list.add("vilash");

        System.out.println("first list: "+ list);

        LinkedList<String> list2=new LinkedList<>();
         list2=(LinkedList)list.clone();  //clone() method returns a shallow copy of this LinkedList.

         System.out.println("second  list: "+ list2);


}
}
