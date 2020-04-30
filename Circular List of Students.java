// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/2976

import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
	    int test = scan.nextInt();
        while(test-->0)
        {
            int start = scan.nextInt(), position = scan.nextInt();
            position = position % 12;
            int a[] = {0,1,2,3,4,5,6,7,8,9,10,11};
            int cur = start + 1;
            for(int i=0;i<position;i++)
            {
                cur = cur % 12;
                cur++;
            }
            System.out.println(a[cur-1]);
        }
        scan.close();
	}
}
