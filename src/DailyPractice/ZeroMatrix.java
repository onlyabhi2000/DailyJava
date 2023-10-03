package DailyPractice;


/*
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and 
column are set to 0. */
public class ZeroMatrix {
	public void setZeros(int[] [] matrix) {
		int n = matrix.length;
		int m = matrix.length;
		boolean row= false;
		boolean column = false;
		
		
		for(int i=0;i<n;i++)
			if(matrix[i][0]==0)
				column=true;
		
		for(int j=0;j<m;j++)
			if(matrix[0][j]==0)
				row=true;
		
		//ignoring 1st row nd column
		for(int i=1;i<n;i++) {
			for(int j =1;j<m;j++) {
				if(matrix[i][j]==0) {
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		
		//make full row to 0 if find aany 0
		for(int i=1;i<n;i++) {
			if(matrix[i][0]==0) {
				for(int j =0;j<m;j++){//ith row ka 0th will be 0
					matrix[i][j]=0;
					
				}//ith row ka 0th will be 0
				
			}
			
		}
		
		for(int j =1;j<m;j++) {
			if(matrix[0][j]==0) {
				for(int i=0;i<n;i++) {
					matrix[i][j]=0;
					
				}
				
			}
			
		}
		//agr row me 0 rahega to usko pura 0 kr denge same for column
		if(row) {
			for(int j =0;j<m;j++) {
				matrix[0][j]=0;
			}
			 
		}
		if(column) {
			for(int i=0;i<n;i++) {
				matrix[i][0]=0;
			}
			
		}
	}
	
	//isRow =true
	//isCol =true
	//ignore [0,0] element
	
	
	
	public static void main(String[] args) {
		 int[][] matrix = { {1, 0, 3},  {4, 5, 6},{7, 0, 9}};
		 
		 ZeroMatrix zeroMatrix = new ZeroMatrix();
	        zeroMatrix.setZeros(matrix);
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	}
	
	

}
