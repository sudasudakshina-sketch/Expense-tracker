import java.util.Scanner;
class Sudakshina{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
int sum=0;
int rem;
int num;
System.out.println("Enter a number");
num=scan.nextInt();
while(num!=0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
System.out.println("sum="+sum);
}
}
