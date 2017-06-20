import java.util.*;
import java.util.Scanner;
class Number
{
public static void main(String[] args)
{
int count=0;
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
while(N>0)
{
N=N/10;
count=count+1;
}
System.out.println("Number of digits:"+count);
}
}
