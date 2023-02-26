//program: find a peak element index and value in the given array
//TC: O(n)
//SC: O(1)

public class Peak_Element {

    //method to find the peak element is
    public static int find_peak(int arr[], int size)
    {
        //if only one element
        if(size==1)
        return 0;
        //if first element is peak
        if(arr[0]> arr[1])
        return 0;
        //if last element is peak
        if(arr[size-1]>arr[size-2])
        return size-1;

        //for peak element is present in the middle
        for(int i=1; i<size-1; i++)
        {
            if(arr[i]>= arr[i+1] && arr[i]>= arr[i-1])
            return i;
        }

      return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 4 ,6 ,2, 3};
        int size= arr.length;
         
        int idx=find_peak(arr, size);
        System.out.println("peak element index is: "+idx);
        System.err.println("peak element is "+ arr[idx]);
    }
}
