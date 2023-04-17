package com.vectmath.VecmathDemo;

import java.util.Scanner;
import javax.vecmath.Matrix3d;

/**
 * Hello world!
 *
 */
public class App {
	private static Matrix3d readMatrix() {
		// Create a scanner object.
		Scanner scanner = new Scanner(System.in);
		// Read input elements for matrix from user.
		double[] matrixElements = new double[3 * 3];
		for (int index = 0; index < matrixElements.length; index++) {
			matrixElements[index] = scanner.nextDouble();
		}
		// Create and return the matrix.
		return new Matrix3d(matrixElements);
	}

	public static void main(String[] args) {
		// Declare two matrix variables
		Matrix3d matrix1, matrix2;
		// Read input for matrix1
		System.out.println("Enter input elements for 3X3 matrix#1: ");
		matrix1 = readMatrix();
		// Read input for matrix2
		System.out.println("Enter input elements for 3X3 matrix#2: ");
		matrix2 = readMatrix();
		Matrix3d resultMatrix = new Matrix3d();
		// Matrix addition
		System.out.println("The addition of two matrices is:");
		resultMatrix.add(matrix1, matrix2);
		System.out.println(resultMatrix);
		// Matrix multiplication
		System.out.println("The multiplication of two matrices is:");
		resultMatrix.mul(matrix1, matrix2);
		System.out.println(resultMatrix);
	}
}
