class FcsTwelve{
public static void main(String ar[]){
int n=Integer.parseInt(ar[0]);
int i;
String res="PRIME";
for(i=2;i<=n;i++)
{
if(n%i==0)
{
res="NOT PRIME";
break;
}
}
System.out.println(res);
}
}