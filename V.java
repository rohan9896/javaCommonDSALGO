import java.util.*;
import java.io.*;

public class V {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    char c;
    int gap = 8;
    Scanner sc = new Scanner(System.in);
    c = sc.next().charAt(0);
    for(int i=1;i<=5;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      for(int k=1;k<=5-i;k++)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=5-i;k++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print(i-j+1);
      }
      System.out.println();
    }
  }
}
