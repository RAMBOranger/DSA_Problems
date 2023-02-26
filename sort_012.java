//program: sort the given arrays of 0's, 1's and 2's
//TC: O(n)
//SC: O(1)

public class sort_012 {
    public static void sort012(int arr[], int size)
    {
        int low=0, mid=0;
        int high=size-1;
        int temp=0;

        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:  //swap
                         temp=arr[low];
                         arr[low]=arr[mid];
                         arr[mid]=temp;
                         //low++
                         low++;
                         //mid++
                         mid++;
              break;
                case 1:  //mid++
                        mid++;
                break;

                case 2:  //swap
                        temp=arr[high];
                        arr[high]=arr[mid];
                        arr[mid]=temp;

                        //high--
                        high--;
                break;
            }
        }

    }

    public static void printArray(int arr[], int size)
    {int i=0;
        while(i<size)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,2,0,0,1,2,2,1};
        int size=arr.length;
        System.out.println(size);

        //sorting function
        sort012(arr, size);

        //print the array
        printArray(arr,size);
        
    }
}
