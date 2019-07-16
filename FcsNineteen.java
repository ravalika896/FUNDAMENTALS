class FcsNineteen{
public static void main(String ar[]){
int n=1,ctr=1;
while(ctr<=5)
{
if(n%2==0 && n%3==0 && n%5==0)
{
ctr++;
System.out.println(n);
}
n++;
}
}
}