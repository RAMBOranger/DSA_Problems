//program: find intersection and union of the given arrays  ???????????
//TC: O(n)
//SC: O(1)

public class Find_Intersection_Union {
    public static void find_intersection(int arr1[], int arr2[],int  size1, int size2)
    {
        int i=0 ,j=0;

        while(i<size1 && j<size2)
        {
            if(arr1[i]==arr2[j])
            {
                System.out.print(arr1[i++]+" ");
                j++;
            }
            else
            {
                i++; j++;
            }
        }
    }

    //method to find union
    public static void find_union(int arr1[], int arr2[],int  size1, int size2)
    {
        int i=0 ,j=0;

        while(i<size1 && j<size2)
        {
            if(arr1[i]<arr2[j])
            {
                System.out.print(arr1[i++]+" ");
            }
            if(arr1[i]>arr2[j])
            {
                System.out.print(arr2[j++]+" ");
            }
            else
            {
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }

        //for remaining elements
        while(i<size1)
        {
            System.out.print(arr1[i++]+" ");
        }
        while(j<size2)
        {
            System.out.print(arr2[j++]+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[]={1, 2,3,4,5,6};
        int size1= arr1.length;
        int arr2[]={7, 8, 9, 3,5};
        int size2= arr2.length;

        find_intersection(arr1, arr2, size1, size2);
        find_union(arr1, arr2, size1, size2);
     
    }
}
