
package com.capgemini.mathOperations;

import Jama.Matrix;

public class MatrixAlg {
	public static double[][] multipleMatrix(double[][] array1, double[] array2) {

		Matrix a = new Matrix(array1);
		Matrix b = new Matrix(array2,1);
		return b.times(a).getArray();
	}

}
