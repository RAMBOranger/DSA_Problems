import java.util.Arrays;

//program: find kth largest element
//TC: O(n)
//SC: O(1)

public class Find_Kth_Largest {
    public static int find_kth_largest(int arr[], int size, int target)
    {
        //sort the array
        Arrays.sort(arr);
        return arr[(size-1)-target+1];

    }

    public static void main(String[] args) {
        int arr[]={1, 9, 17, 4 ,6 ,2, 3};
        int size= arr.length;
        int target=2;

        int result=find_kth_largest(arr, size, target);
        System.out.println("kth largest: "+result);
    }
}
