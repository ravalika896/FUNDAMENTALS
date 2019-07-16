class FcsThirteen{
public static void main(String ar[]){
for(int n=10;n<=99;n++)
{
int ct=0;
int i;
for(i=2;i<n;i++)
{
if(n%i==0)
{
ct++;
}
}
if(ct==0)
System.out.println(n);
}
}
}