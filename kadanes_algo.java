//program: kadane's algorithm (largest sub sequence sum)
//TC: O(n)
//SC: O(1)

public class kadanes_algo {

    //method of kadane
    public static int kadane(int arr[], int size)
    {
        //make two variables
        int updating=0;
        int updated=Integer.MIN_VALUE;

        for(int i=0; i<size; i++)
        {
            //step 1
            updating+=arr[i];
            //step 2
            if(updated<updating)
            {
                updated=updating;
            }
            //step 3
            if(updating<0)
            updating=0;
        }
        return updated;
    }
    public static void main(String[] args) {
        int arr[]={1, -1, -4, 5 ,6,-9};
        int size=arr.length;
        
       System.out.println("kadane's result: "+kadane(arr, size)); 
    }
}
