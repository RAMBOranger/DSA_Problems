//program 11.: find the missing element in the given array
// TC=O(n)
//  SC=O(n)   (since we have used temp array)

public class Find_The_Missing_ELement {

    public static int Find_Missing(int arr[], int size)
    { 
        int res=0;
        int temp[]= new int[size+1];   // by default initialized with 0

        //now map the temp to 1 by using given array
        for(int i=0; i<size; i++)  //here i<size (since size-1 elements are there)
        {
            temp[arr[i]-1]=1;
        }

        for(int i=0; i<=size; i++)
        {
            if(temp[i]==0)
            res= i+1;
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,8,7,4,9,6};
        int size= arr.length;

        int missed=Find_Missing(arr, size);
        System.out.println("missing element is: "+missed);
    }
}
