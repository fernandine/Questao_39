package application;

import java.util.Locale;
import java.util.Scanner;

import entity.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		ContaCorrente cc = new ContaCorrente("jose", 1254, 200.0);
		
		
		
		sc.close();
	}

}
