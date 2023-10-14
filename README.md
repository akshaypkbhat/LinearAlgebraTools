# LinearAlgebraTools

The Linear Algebra Toolset is a comprehensive software package designed to facilitate vector and matrix operations. 
It serves as a valuable resource for developers, mathematicians, and researchers working with linear algebra concepts. 

int[] dimensions(double[][] m) 

* Returns, as an array of two elements, the dimensions of matrix m.

double magnitude(double[] v) 

* Returns the magnitude of the vector v (which may be of any length). This is found by adding up the squares of all of the elements of v and taking the square root of the total.

double[] sum(double[] v, double[] w) 

* Returns the sum of vectors v and w. This is a vector of the same length, each of whose elements is the sum of the corresponding elements in v and w.

double[] difference(double[] v, double[] w) 

* Returns the difference between vectors v and w. This is a vector of the same length, each of whose elements is the difference between the corresponding elements in v and w.

double[] elementwiseProduct(double[] v, double[] w) 

* Returns the element-wise between vectors v and w. This is a vector of the same length, each of whose elements is the product of the corresponding elements in v and w.

double dotProduct(double[] v, double[] w) 

* Returns the dot product of vectors v and w. This is the sum of the products of the corresponding elements.   

double[][] sum(double[][] m, double[][] n) 

* Returns the element-wise sum of matrices m and n.

double[][] elementwiseProduct(double[][] m, double[][] n) 

* Returns the element-wise product of matri1ces m and n.

double[][] transpose(double[][] m) 

* Returns the transpose of m, that is, a matrix where element i, j is element j, i from m.

double[][] product(double[][] m, double[][] n) 

* Returns the matrix product of m and n. (Search the web for a definition.)
