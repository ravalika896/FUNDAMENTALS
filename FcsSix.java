class FcsSix{
public static void main(String ar[]){
int age = Integer.parseInt(ar[1]);
if((ar[0].equals("FEMALE")) && (age>=1 && age<=58))
System.out.println("Percentage of interest is 8.2%");
if((ar[0].equals("FEMALE")) && (age>=59 && age<=100))
System.out.println("Percentage of interest is 9.2%");
if((ar[0].equals("MALE")) && (age>=1 && age<=58))
System.out.println("Percentage of interest is 8.4%");
if((ar[0].equals("FEMALE")) && (age>=59 && age<=100))
System.out.println("Percentage of interest is 10.5%");
}
}