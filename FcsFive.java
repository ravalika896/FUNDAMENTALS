class FcsFive{
public static void main(String ar[]){
char ch='/';
int n=ch;
if((n>=65 && n<=90) || (n>=97 && n<=122))
System.out.println(ch+" is Alphabet");
else if(n>=48 && n<=57)
System.out.println(ch+" is Digit");
else
{
System.out.println(ch+" is special Character");
}
}
}