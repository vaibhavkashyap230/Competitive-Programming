// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/2951

import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]  = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt()-1;
        }
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(Math.abs(a[i]-i)>2)
            {
                System.out.println("NO");
                	return;
            }
        }
        int t = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==i)
                continue;
            else if(i+1<n && a[i+1]==i)
            {
                t+=1;
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            else if(i+2<n && a[i+2]==i)
            {
                t+=2;
                int t1 = a[i];
                a[i] = a[i+2];
            	int t2 = a[i+1];
                a[i+1] = t1;
                a[i+2] = t2;
            }
        }
        System.out.println("YES");
        System.out.println(t);
	}
}
