package QEsolver;

import java.util.Arrays;

import QEsolver.Discriminant;
import QEsolver.DivExeption;
import QEsolver.Solving;

public class QuadraticEquatation {
	
	public static void main(String[] args) throws DivExeption, InterruptedException {
		
		double a = 1.0;
		double b = 2.0;
		double c = 1.0;
		
		Discriminant discriminant = new Discriminant();
		Solving solving = new Solving();
		
		if (discriminant.discriminantCalc(a,b,c) == 0.0){																											
			System.out.println("The equation has one solution: " +solving.solvingEquatution(a,b));
		} else 
		if ((int)(0.0 - discriminant.discriminantCalc(a,b,c)) > 0 || (int)(discriminant.discriminantCalc(a,b,c)) == 0){ 										//if D<0
			System.out.println("The equation hasn't rational solutions\n");
			} else {
				System.out.println("The equation has two solutions: " + Arrays.toString(solving.solvingEquatution(a,b,c, discriminant.discriminantCalc(a, b, c))));}}
}