// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/3003

import java.util.*;
public class Main
{
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),k = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(a);
        int result =a[n-1]-a[0];
        int minus=a[0]+k;
        int large =a[n-1]-k; 
        int temp =0;
        if (minus>large) 
        {
            temp = minus;
            minus = large;
            large = temp;
        } 
        for (int i = 1; i < n-1; i ++) 
        { 
            int subtract = a[i] - k; 
            int add = a[i] + k; 
            if (subtract>=minus || add<=large) 
                continue; 
            if (large-subtract<=add-minus) 
                minus=subtract; 
            else
                large=add; 
        }
        System.out.println(Math.min(result,large-minus));
	}
}
