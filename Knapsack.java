import java.util.*;
class Knapsack
{
    static int[] inp(int n)
    {
        Scanner sc= new Scanner(System.in);  
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
           array[i]=sc.nextInt();  
        }
        return array;  
    }

    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    static int knapSack(int W, int wt[], int val[], int n)
    {
        if (n == 0 || W == 0)
            return 0;
        
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

        else
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt,val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }

    public static void main(String args[])
    {
        // int val[] = new int[] { 60, 100, 120 };
        // int wt[] = new int[] { 10, 20, 30 };
        int x;  
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        x=sc.nextInt();
        int val[] = new int[x];
        int wt[] = new int[x];
        val = inp(x);
        wt = inp(x);
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}

