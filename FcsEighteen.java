class FcsEighteen{
public static void main(String ar[]){
int n=Integer.parseInt(ar[0]);
int rev=0,rem,org;
org=n;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n/=10;
}
if(org==rev)
System.out.println(org+"is a palindrome");
else
System.out.println(org+"is not a palindrome");
}
}
