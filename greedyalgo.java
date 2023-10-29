import java.util.*;
    import java.io.*;
    import java.util.PriorityQueue; 

    class gold
     { 
    static int remgold(int arr[], int n) 
    { 
        int i, sum = 0; 
        PriorityQueue<Integer> pq =  
             new PriorityQueue<Integer>(Collections.reverseOrder()); 
        for (i = 0; i < n; i++) 
            pq.add(arr[i]); 
        while (pq.size() > 1) 
        { int y = pq.poll();
        int x = pq.poll();;
        if (x < y)
            pq.add(y - x);
        } 
        if(pq.size()==0)
        return 0;
        return pq.poll();
    } 
    public static void main(String[] args) 
    { Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0 ){
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
        System.out.println(remgold(arr, n)); }
    } 
    } 
