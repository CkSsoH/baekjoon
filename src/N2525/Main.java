package N2525;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = b+c;
		if(0<=a && a<=23 && 0<=b && b<=59 && 0<=c && c<=1000) {
			if(d<60) {
				System.out.println(a +" "+ d);
			} else if(60<=d){
				a = a+(d/60);
				if(a == 24) {
					a=0;
				} else {
					a = (a%24);
				}
				if(d%60==0) {
					d=0;
				}else {
					d = (d%60);
				}
				System.out.println(a +" "+d);
			}			
		} 
	}

}
