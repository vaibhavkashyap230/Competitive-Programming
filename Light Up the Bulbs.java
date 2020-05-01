// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/2965

import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int x = in.nextInt(), y  = in.nextInt();
        String a = in.next();
        in.close();
        int t=0;
        if(a.charAt(0)=='0')
        {
            t=1;
        }
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i)=='1' && i+1<n && a.charAt(i+1)=='0')
            {
                t++;
            }
        }
        if(t==0)
            System.out.println(0);
        else
        {
            long r = (t-1);
            r=r*Math.min(x,y);
            r=r+y;
            System.out.println(r);
        }
	}
}
