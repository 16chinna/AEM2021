package sample1;
import utilities.*;
import java.io.*;
import java.util.Arrays;
public class IntArr {
	int a[];
   public void singleArray() {
	   
	    a=new int[10];
   }
   public void singleArray(int n) {
	   
	    a=new int[n];
   }
   public void createArray() {
	   for (int i = 0; i < a.length-1; i++) {
           a[i] = Read.sc.nextInt();
          
       }
       
   }
   public void sortArr() {
	   Arrays.sort(a);
   }
   public void sum() {
	   int sum=0;
	   for(int i=0;i<a.length;i++) {
		   sum=a[i]+sum;
	   }
   }
   public void vert() {
		System.out.println("Array :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public void hor() {
		System.out.println("Array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
    
  

}

