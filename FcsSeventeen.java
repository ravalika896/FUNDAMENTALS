class FcsSeventeen{
public static void main(String ar[]){
int rev=0;
int n=Integer.parseInt(ar[0]);
while(n!=0)
{
rev=rev*10;
rev=rev+n%10;
n=n/10;
}
System.out.println("REVERSE OF THE NUMBER IS"+rev);
}
}
