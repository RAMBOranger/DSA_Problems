//program: find the min and max element in the given array
//TC: O(n)
//SC: O(1)

public class Find_Min_Max {
    //for max
    public static int find_max(int arr[], int size)
    {
        int max=arr[0];

        for(int i=0; i<size; i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }

    //for min
    public static int find_min(int arr[], int size)
    {
        int min=arr[0];

        for(int i=0; i<size; i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 4 ,6 ,2, 3};
        int size= arr.length;

        System.out.println("min element :"+find_min(arr,size));
        System.out.println("max element :"+find_max(arr,size));

    }
}
