import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int n=num/10;
      int m=n%10;
      System.out.println(m);
	}
}