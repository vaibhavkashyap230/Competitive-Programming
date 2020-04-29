// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/1755

import java.util.*;

public class Main
{	
    private static boolean check(int a[],int t,int k)
    {
        int cur = 0;
        for(int i=0;i<a.length;i++)
        {
            cur += a[i]/t;
        }
        if(cur>=k)
            return true;
        return false;
    }
	public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        while(tests-->0)
        {
            int n = s.nextInt();
            int k = s.nextInt();
            int candy[] = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                candy[i] = s.nextInt();
                max = Math.max(max,candy[i]);
            }
            int min = 0;
            while(min<=max)
            {
                int mid = (min+max)/2;
                if(check(candy,mid,k))
                {
                    min = mid+1;
                }
                else
                {
                    max = mid-1;
                }
            }
            System.out.println(min-1);
        }
        s.close();
	}
}
