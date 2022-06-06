package N10818;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		ArrayList<Integer> list = new ArrayList<>();

		for(int i=1; i<=n; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		/* System.out.println(list); */
		
		for(Integer x : list) {
			if(x < min) {
				min = x;
			}
			if(x > max) {
				max = x;
			}
		}
		System.out.print(min+" ");
		System.out.println(max);
	}
}
