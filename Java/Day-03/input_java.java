/* input  in java */


/**************************/

import java.util.Scanner;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x,y,z;
		x=input.nextInt();
		y=input.nextInt();
		z=x+y;
		System.out.println(x+" + "+y+" = "+z);
	}
}

/**************************/

import java.util.Scanner;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x,y,z;
		System.out.println("Insert Number 1 then hit enter");
		x=input.nextInt();
		System.out.println("Insert Number 2 then hit enter");
		y=input.nextInt();
		z=x+y;
		System.out.println(x+" + "+y+" = "+z);
	}
}
