package N2739;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i=i+1) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}
