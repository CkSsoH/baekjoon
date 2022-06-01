package N10871;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[a-1];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
