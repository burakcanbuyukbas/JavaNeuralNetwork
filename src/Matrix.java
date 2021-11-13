package com.company;

public class Matrix implements IMatrix {

    private double [][]data;
    private int rows,cols;

    public double[][] getData() {
        return data;
    }

    public void setData(double[][] data) {
        this.data = data;
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

    public IMatrix Matrix(int rows, int cols)
    {
        //write code here
        //this constructor is expected to create a matrix with random numbers in size of given arguments(rows,cols)
        return null;
    }

    @Override
    public String ToString() {
        //write code here
        //this method is expected to print the matrix to the console
        return null;
    }

}
