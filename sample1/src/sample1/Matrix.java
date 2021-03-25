package sample1;


public class Matrix {
	// Class can have constructor which will get executed automatically when object
		// created
		// is created
		// A Constructor should be same as a class name without return type
		// A constructors can be overloaded
		// it is better to have class with different constructor
		// if there is no constructor zero argument default constructors can be
		// automatically created
		int mat[][];

		// Copy Constructor
		public Matrix() {
			mat = new int[3][3];
		}

		// Argument Constructor
		public Matrix(int m, int n) {
			mat = new int[m][n];
		}

		// Copy Constructor
		public Matrix(Matrix ob) {
			this.mat = ob.mat;
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
		public Matrix matAdd(Matrix ob) {
			Matrix m1 = new Matrix(this.mat.length, this.mat[0].length);
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					m1.mat[i][j] = this.mat[i][j] + ob.mat[i][j];
				}
			}
			return m1;
		}

		// Matrix Multiplication
		public Matrix matmul(Matrix ob) {
			
			
			Matrix m2 = new Matrix(this.mat.length, this.mat[0].length);
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					for(int k=0;k<mat.length;k++) {
					m2.mat[i][j] = this.mat[i][k] * ob.mat[k][j];
					}
				}
			}
			return m2;
			
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
