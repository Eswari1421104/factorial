package factorial;

import java.io.*;
import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {int i,f=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
              for(i=1;i<n;i++)
              {
                 f=f*i ;
              
              System.out.println(f);
              }
    }
}
