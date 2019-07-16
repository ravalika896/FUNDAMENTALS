class FcsFifteen{
public static void main(String ar[]){
int i,sum=0;
int n=Integer.parseInt(ar[0]);
System.out.println("ENTER THE NUMBER");
while(n>0)
{
i=n%10;
sum=sum+i;
n=n/10;
}
System.out.println("SUM OF THE DIGITS"+sum);
}
}