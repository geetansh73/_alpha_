import java.util.*;
class alpha
{
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=sc.next();
        }
for(int i=0;i<arr.length-1;i++)
{
for(int j=0;j<arr.length-i-1;j++)
{
if (arr[j].compareTo(arr[j+1])>=1)
{
String temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}