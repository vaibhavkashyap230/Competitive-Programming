// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/2940

import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
    {
       	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), k = s.nextInt(), l = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        s.close();
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for(int i : a)
        {
            if(i<min)
                min = i;
            if(i>max)
                max = i;
        }
        if(min==max)
        {
            System.out.println(0);
            return;
        }
        int gmin = Integer.MAX_VALUE;
        for(int i=min;i<=max;i++)
        {
            int inc=0,dec=0;
            for(int j : a)
            {
                if(j<i)
                    inc+=i-j;
                else
                    dec+=j-i;
            }
            if(dec>inc)
                continue;
            int temp = ( k * Math.min(inc,dec) )+ ( l * (inc-dec) );
            if(temp<gmin)
                gmin=temp;
        }
        System.out.println(gmin);
	}
}
