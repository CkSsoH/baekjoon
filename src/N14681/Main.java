package N14681;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x!=0 && -1000<=x && x<=1000 && y!=0 && -1000<=y && y<=1000) {
			if(0<x && 0<y) {
				System.out.println("1");
			} else if(x<0 && 0<y) {
				System.out.println("2");
			} else if(x<0 && y<0) {
				System.out.println("3");
			} else {
				System.out.println("4");
			}
		}
	}
}
