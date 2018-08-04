//cheks the type of a triangle and returns the boolean value of result
public class Triangle {
	int side1, side2, side3;// instance members

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// checks if the sides form a triangle
	boolean isTriangle() {
		int max = Math.max(Math.max(side1, side2), side3);
		return (side1 > 0 && side2 > 0 && side3 > 0) && (max <= side1 + side2 + side3 - max);
	}

	// checks if the triangle is a right angled triangle
	boolean isRight() {
		int max = Math.max(Math.max(side1, side2), side3);
		return (isTriangle() && ((max * max) == ((side1 * side1) + (side2 * side2) + (side3 * side3) - (max * max))));
	}

	// checks f the trinagle is Scalene triangle
	boolean isScalene() {
		return (isTriangle() && (side1 != side2 && side2 != side3 && side3 != side1) && (!isRight()));
	}

	// checks if the triangle is isosceles triangle
	boolean isIsosceles() {
		return (isTriangle() && ((side1 == side2 && side1 != side3) || (side2 == side3 && side2 != side1)
				|| (side1 == side3 && side1 != side2)));
	}

	// checks if the triangle is equilatral triangle
	boolean isEquilateral() {
		return (isTriangle() && (side1 == side2 && side2 == side3));
	}
}
