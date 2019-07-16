class FcsEight{
public static void main(String ar[]){
char ch=ar[0].charAt(0);
String res="";
switch(ch)
{
case 'R':res="RED";break;
case 'B':res="BLUE";break;
case 'Y':res="YELLOW";break;
case 'O':res="ORANGE";break;
case 'W':res="WHITE";break;
case 'G':res="GREEN";break;
default:res="INVALID CODE";
}
System.out.println(res);
}
}
