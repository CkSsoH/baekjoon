package N2884;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m;
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(m<45) {
			if(h==0) {
				h=23;
				System.out.println(h +" "+(m+60-45));
			} else {
				System.out.println((h-1) +" "+(m+60-45));
			}
		} else if(45<=m || m<60){
				System.out.println(h +" "+(m-45));
		}
	}
}
