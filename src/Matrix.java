import java.util.Random;

public class Matrix implements IMatrix {
	
	Random rand = new Random(); //instance of random class
   
    private static int[][] data;
    private int rows,cols;
	public int[][] getData() {
        return data;
    }

	public static void setData(int[][] matrix) {
        data = matrix;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public Matrix(int rows, int cols){
    	
        int[][] matrix = new int[rows][cols];
    	
   	    for(int i = 0 ; i < rows ; i++) {
    		
    		for(int j = 0 ; j < cols ; j++) {
    			
    			matrix[i][j] = rand.nextInt(10);
    		}
        }
   	    Matrix.setData(matrix);
     		
    }
    	
        //write code here
        //this constructor is expected to create a matrix with random numbers in size of given arguments(rows,cols)
        

    @Override
    public void ToString(Matrix mat) {
    	
    	for(int i = 0 ; i < mat.data.length ; i++) {
    		for(int j = 0 ; j < mat.data[0].length ; j++) {
    			
				System.out.print(mat.data[i][j] + " ");
    		}
    			
    	    System.out.println();
    	}
    	
        //write code here
        //this method is expected to print the matrix to the console
        
    }

	@Override
	public void ToString() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ToString(Object object) {
		// TODO Auto-generated method stub
		
	}

	

}
