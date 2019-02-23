import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f_d=n/100;
    int s_d=((n/10)%10);
    int t_d=n%10;
    int rev=(t_d*100)+(s_d*10)+f_d;
    System.out.println(rev);
  }
}