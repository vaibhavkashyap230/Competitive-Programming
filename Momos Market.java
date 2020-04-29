// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/2953

import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
	    int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int d=s.nextInt();
        
        int sav[]=new int[d];
        for(int i=0;i<d;i++)
        {
            sav[i]=s.nextInt();
        }
        int sum[] = new int[n];
        sum[0] = a[0];
        for(int i=1;i<n;i++)
        {
            sum[i]= sum[i-1] + a[i];
        }
        for(int i=0;i<d;i++)
        {
            int res = 0;
            for(int j=0;j<n;j++)
            {
                if(sum[j]>sav[i])
                {
                    break;
                }
                res++;
            }
            int rem;
            if(res==0)
            {
                rem = sav[i];
            }
            else
            {
                rem = sav[i]-sum[res-1];
            }
            System.out.println(res+" "+rem);
        }
        s.close();
	}
}
