class FcsFourteen{
public static void main(String ar[]){
int l=ar.length;
int n=Integer.parseInt(ar[0]);
int ctr=0;
int i;
if(l==0)
System.out.println("ENTER AN INTEGER");
else
{
if(n==1)
System.out.println("NEITHER PRIME NOR COMPOSITE");
else
{
for(i=2;i<n;i++)
{
crt++;
}
}
if (crt==0)
System.out.println("PRIME");
else
{
System.out.println("COMPOSITE");
}
}
}
}