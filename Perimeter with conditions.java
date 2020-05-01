// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/2996

import java.util.*;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int l[] = new int[n];
        for(int i=0;i<n;i++)
        {
            l[i] = s.nextInt();
        }
        s.close();
        Arrays.sort(l);
        int ar[]=new int[3];
        for(int x=l.length-1;x>=2;x--)
        {
            if(l[x-2]+l[x-1]>l[x])
            {
                ar[0]=l[x-2];
                ar[1]=l[x-1];
                ar[2]=l[x];
                {
                    System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
                    	return;
                }
            }
        }
        System.out.println(-1);
    }
}
