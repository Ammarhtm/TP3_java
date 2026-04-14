package Tp3.java;

import java.util.Random;
import java.util.Scanner;

public class Exe7Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int x = random.nextInt(10);
		int guess =0,count=1;

        System.out.println("choisir un nombre entre 1 et 10 !");
        
        while(guess != x) {
        	System.out.print("entrer un nombre: ");
            guess = sc.nextInt();
            if(guess < x) {
            	System.out.println("plus");
            	count++;
            }
            else if(guess > x) {
            	System.out.println("moins");
            	count++;
            }
            else {
            	System.out.println("Bravooo! nombres de tentaives est: "+count);
            }
            
        }
	}


}
