import java.util.Scanner;

public class recusionarry {
    public static void rev(int l,int r,int []arr)
    {
        int t = 0;
            if(l != r)
            {
                t = arr[r];
                arr[r] = arr[l];
                arr[l] = t;
                rev(l+1,r-1,arr); 
            }
    }
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // to scan a integer
        int []arr = new int[n];  
        for(int i= 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        rev(0,n-1,arr);
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
