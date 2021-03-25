package sample1;

public class Matrix1 {
	int mat[][];

	// Copy Constructor
	public Matrix1() {
		mat = new int[3][3];
	}

	// Argument Constructor
	public Matrix1(int m, int n) {
		mat = new int[m][n];
	}

	// Copy Constructor
	public Matrix1(Matrix1 obj) {
		this.mat = obj.mat;
	}

	// Reading Matrix from User
	public void matrixCreation() {
		System.out.println("Enter Matrix:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = Read.sc.nextInt();
			}
		}

	}

	// Matrix Addition
	

	// Matrix Multiplication
	public Matrix1 matmul(Matrix1 ob) {
		
		
		Matrix1 m1 = new Matrix1(this.mat.length, this.mat[0].length);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				for(int k=0;k<mat.length;k++) {
				m1.mat[i][j] += this.mat[i][k] * ob.mat[k][j];
				}
			}
		}
		return m1;
		
	}

	// Place Your Code Here

	// Printing the Matrix
	public void display() {
		System.out.println("Matrix: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

	// Destructor removes the memory before Garbage Collection.

	public void finalize() {
		System.out.println("I am in destructor");
		mat = null;
	}


}



