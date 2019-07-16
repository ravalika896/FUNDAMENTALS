class FcsSixteen{
public static void main(String ar[]){
int n=Integer.parseInt(ar[0]);
int l=ar.length;
int i,j;
if(l==0)
System.out.println("PLEASE ENTER THE NUMBER");
else
{
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
System.out.print("*");

System.out.println();
}
}
}
}
