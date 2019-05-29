import java.util.*;
public class Product
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,temp=0,pro;
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
pro=arr[i]*arr[j];
if(pro>temp)
temp=pro;
}
}
System.out.print(temp);
}
}