import java.util.*;
public class Removal
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String str1=in.nextLine();
String str2=in.nextLine();
char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();
int l1,l2,i,j;
l1=str1.length();
l2=str2.length();
for(i=0;i<l2;i++)
{
for(j=0;j<l1;j++)
{
if(ch2[i]==ch1[j])
{
ch1[j]='0';
}
}
}
String str3=new String(ch1);
String str4=str3.replace("0","");
System.out.print(str4);
}
}

