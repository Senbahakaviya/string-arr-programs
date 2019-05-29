import java.util.*;
public class Greaterright
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,temp=0;
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n-1;i++)
{
temp=0;
for(j=i+1;j<n;j++)
{
if(arr[j]>temp)
temp=arr[j];
}
System.out.print(temp);
}
System.out.print("-1");
}
}