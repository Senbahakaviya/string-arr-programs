import java.util.*;
public class Reverseword
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String str=in.nextLine();
String[] str1=str.split(" ");
int l,i,j;
l=str1.length;
for(i=0;i<l;i++)
{
String str3="";
for(j=str1[i].length()-1;j>=0;j--)
{
str3=str3+str1[i].charAt(j);
}
System.out.print(str3+" ");
}
}
}
INPUT:I like this program
OUTPUT:I ekil siht margorp
