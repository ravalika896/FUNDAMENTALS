class FcsNine{
public static void main(String ar[]){
int n=Integer.parseInt(ar[0]);
String res="";
switch(n)
{
case 1:res="JANUARY";break;
case 2:res="FRBRUARY";break;
case 3:res="MARCH";break;
case 4:res="APRIL";break;
case 5:res="MAY";break;
case 6:res="JUNE";break;
case 7:res="JULY";break;
case 8:res="AUGUST";break;
case 9:res="SEPTEMBER";break;
case 10:res="OCTOBER";break;
case 11:res="NOVEMBER";break;
case 12:res="DECEMBER";break;
default:res="INVALID MONTH";
}
System.out.println(res);
}
}