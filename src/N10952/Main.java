package N10952;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i=1; 0<i; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}
	}
}