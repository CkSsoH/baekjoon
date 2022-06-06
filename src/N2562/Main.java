package N2562;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int maxLine =0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<9; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		/* System.out.println(list); */
		int x;
		for(x =0; x<list.size(); x++) {
			if(max < list.get(x)) {
				max = list.get(x);
			}
			if(list.get(x) == max) {
				maxLine=x;
			}
		}
		System.out.println(max);
		System.out.println(maxLine+1);
	}

}
