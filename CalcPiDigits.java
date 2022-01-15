import java.lang.Math.*;
import java.util.Scanner;
public class CalcPiDigit {
	public static void main(String[] args) {
		double pi = Math.PI;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter digit to calculate pi to: ");
		int digits = scan.nextInt();
		int[] piNum = new int[digits];
		for(int i = 0;i < digits;i++) {
			int num = (int)pi % 10;
			piNum[i] = num;
			pi *= 10;
		}
		for(int i = 0;i < piNum.length;i++) {
			if(i==1) {
				System.out.print('.');
			}
			System.out.print(piNum[i]);
		}
	}
}
