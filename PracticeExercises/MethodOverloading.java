import java.util.Scanner;

public class Overloading{

	public int sum(int a, int b){
		return a+b;
	}

	public int sum(int a, int b, int c){
		return a+b+c;
	}

	public double sum(double a, double b){
		return a+b;
	}
	public static void main(String[] args){
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10.097, 30.786));
	}
}
