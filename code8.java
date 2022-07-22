import java.util.*;
public class code8{
 
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
 
            // If condition fails for any element
            if (arr[(arr.length-1)-i] != arr[i])
                return false;
        }
 
        // Given array is mirror-inverse
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter the length of array");
        int k=sc.nextInt();
        int arr[]=new int[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Enter the element of array");
            arr[i]=sc.nextInt();
        }
        if (isMirrorInverse(arr))
            System.out.println("Yes, it is mirror inverse");
        else
            System.out.println("Not mirror inverse");
    }
}
