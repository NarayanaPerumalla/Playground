import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner n1=new Scanner(System.in);
      	int num1=n1.nextInt();
      	int num2=n1.nextInt();
      if(num1>num2)
         System.out.println("num1 is the greatest number");
      	else
          System.out.println("num2 is the greatest number");
	}
}