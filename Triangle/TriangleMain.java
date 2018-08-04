
//program to check the type of a triangle
import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sides of a triangle");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		Triangle triangle = new Triangle(side1, side2, side3);

		System.out.println("right? " + triangle.isRight());
		// checks if right angled triangle
		System.out.println("Isosceles? " + triangle.isIsosceles());
		// checks if isosceles triangle
		System.out.println("Scalene? " + triangle.isScalene());
		// checks if Scalene triangle
		System.out.println("Equilateral? " + triangle.isEquilateral());
		// checks if equilateral triangle

	}

}
