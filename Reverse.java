//program: reverse the given array
//TC: O(n)
//SC: O(1)

public class Reverse {

    //reverse method
    public static void reverse(int arr[], int size)
    {
        for(int i=0, j=size-1; i<=j; i++, j-- )
        {
          int temp;
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        
        }
    }
    //method to print the array
    public static void print(int arr[], int size)
    {
    
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 9, 4 ,6 ,2, 3};
        int size= arr.length;

        reverse(arr, size);
        print(arr, size);

    }
}
