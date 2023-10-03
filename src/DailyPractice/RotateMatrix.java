package DailyPractice;



/*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?*/
public class RotateMatrix {
	
	public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Transpose 
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
	 public static void printMatrix(int[][] matrix) {
	        int n = matrix.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	
	

	public static void main(String[] args) {
		//transpose matrix 
		//reverse column
		
		 int[][] matrix = { {1, 2, 3},  {4, 5, 6},{7, 8, 9}};


		           
		 
		 rotateMatrix(matrix);
		 System.out.println("Rotated Matrix:");
	        printMatrix(matrix);
		

	}
	

	
}
	

