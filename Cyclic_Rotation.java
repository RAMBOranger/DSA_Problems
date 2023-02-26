//program 12: make the array rotate cyclically by 1
//TC: O(n)
//SC : O(1)

public class Cyclic_Rotation {

    public static void cyclicRotate(int arr[], int size)
    {
        //method 1.  swapping the last element in each itiration
        // for(int i=0, j=size-1;  i<=j;  i++)
        // {
        //     int temp= arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        // }


        //method 2.  a.store the last element in temp, 
         //          b. shift the elements
         //          c.  and now replace first element with first element

         int temp= arr[size-1];   //step 1
        for(int i=size-1;  i>0;  i--) //step 2
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

    }

    public static void print(int arr[], int size)
    {
        for (int i : arr) {
            System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2 ,3 ,4,5,6};
        int size= arr.length;

        System.out.println("before rotation");
        print(arr, size);

       cyclicRotate(arr, size);

       System.out.println("after rotation");
       print(arr, size);
    }
}
