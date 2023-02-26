//program: find the no. of occurences of a particular element in the given array
//TC: O(n)
//SC: O(1)

public class Occurence {
    //method to find the no. of occurences 
    public static int find_occurence(int arr[], int size, int target)
    {
        int count=0;
        for(int i=0; i<size; i++)
        {
            if(arr[i]==target)
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={3, 9,3, 4 ,6 ,2, 3};
        int size= arr.length;
        int target=3;

        int result=find_occurence(arr, size, target);
        System.out.println("occurence result is : "+result);
    }
}
