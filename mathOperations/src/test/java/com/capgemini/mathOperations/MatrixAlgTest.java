package com.capgemini.mathOperations;


import org.junit.Assert;
import org.junit.Test;

import Jama.Matrix;

public class MatrixAlgTest {

	@Test
	public void shouldBeTrue() {
		double[][] array1 = {{1.,2.,3},{1.,2.,3.},{1.,2.,3.}}; 
		double[] array2 = {1., 1., 1.};
		Matrix w = new Matrix(new double[]{3., 6., 9.}, 1); 
		Assert.assertArrayEquals(w.getArray(), MatrixAlg.multipleMatrix(array1, array2));
	}

}
