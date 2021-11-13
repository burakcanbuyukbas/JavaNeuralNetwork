package com.company;

public interface IMatrixTool {

    public IMatrix add(IMatrix M, double x);

    public IMatrix add(IMatrix M, IMatrix N);

    public IMatrix subtract(IMatrix M, IMatrix N);

    public IMatrix transpose(IMatrix M);

    public IMatrix multiply(IMatrix M, IMatrix N);

    public IMatrix multiply(IMatrix M, double x);

}
