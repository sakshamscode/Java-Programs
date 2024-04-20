import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be searched n :");
        int n=sc.nextInt();
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==n)
            {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<n)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }


    }

    }

