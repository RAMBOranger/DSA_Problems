
//program: move all negative no. to one side of the given array
//TC: O(n)
//SC: O(1)

public class Move_All_Neg_To_OneSide {

    //method to move all negative at one side
    public static void move_negative(int arr[], int size)
    {
        int p=0;//currently points to first element

        for(int i=1; i<size; i++)
        {
            if(arr[i]<0)
            {
                if(i!=p)
                {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[p];
                    arr[p]=temp;
                }
                p++;   //after successful swap increase p
            }
        }
    }

    //method 2. for movind negative no. to one side
    // public static void move_negative(int arr[])
    // {
    //     Arrays.sort(arr);
    // }

    //print method
    public static void print(int arr[], int size)
    {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    
    public static void main(String[] args) {
        int arr[]={1, -9, 17, -4 ,6 ,-2, 3};
        int size= arr.length;

        move_negative(arr, size);
        print(arr, size);

    // move_negative(arr);
    }
}
