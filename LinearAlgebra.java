/**
 * Various functions dealing with vectors and matrices.
 *
 * @author Akshay Bhatia
 */
class LinearAlgebra {

    /**
     * Returns the magnitude of the vector v (which may be of any length).
     * This is found by adding up the squares of all of the elements of v
     * and taking the square root of the total.
     */
    static double magnitude(double[] v) {
        double m = 0.0;
        for (double i : v) {
            m += (i*i);
        }

        return Math.sqrt(m);
    }

    /**
     * Returns the sum of vectors v and w. This is a vector of the same
     * length, each of whose elements is the sum of the corresponding
     * elements in v and w.
     */
    static double[] sum(double[] v, double[] w) {

        double[] sum = new double[v.length];

        for (int i = 0; i < v.length; i++){
            sum[i] = v[i] + w[i];
        }

        return sum;
    }

    /**
     * Returns the difference between vectors v and w. This is a vector
     * of the same length, each of whose elements is the difference
     * between the corresponding elements in v and w.
     */
    static double[] difference(double[] v, double[] w) {
        double[] difference = new double[v.length];

        for (int i = 0; i < v.length; i++){
            difference[i] = v[i] - w[i];
        }

        return difference;
    }

    /**
     * Returns the element-wise between vectors v and w. This is a vector
     * of the same length, each of whose elements is the product of the
     * corresponding elements in v and w.
     */
    static double[] elementwiseProduct(double[] v, double[] w) {
        double[] p = new double[v.length];

        for (int i = 0; i < v.length; i++){
            p[i] = v[i] * w[i];
        }

        return p;
    }

    /**
     * Returns the dot product of vectors v and w. This is the sum of
     * the products of the corresponding elements.
     */
    static double dotProduct(double[] v, double[] w) {
        double[] d = new double[v.length];
        d = elementwiseProduct(v, w);

        double sum = 0;
        for (double value : v) {
            sum += value;
        }

        return sum;
    }

    /**
     * Returns, as an array of two elements, the dimensions of matrix m.
     */
    static int[] dimensions(double[][] m) {
        int[] dim = {m.length, m[0].length};

        return dim;
    }

    /**
     * Returns the element-wise sum of matrices m and n.
     */
    static double[][] sum(double[][] m, double[][] n) {
        double[][] sum = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                sum[i][j] = m[i][j] + n[i][j];
            }
        }

        return sum;
    }

    /**
     * Returns the element-wise product of matri1ces m and n.
     */
    static double[][] elementwiseProduct(double[][] m, double[][] n) {
        double[][] product = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                product[i][j] = m[i][j] * n[i][j];
            }
        }

        return product;
    }

    /**
     * Returns the transpose of m, that is, a matrix where element
     * i, j is element j, i from m.
     */
    static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    /**
     * Returns the matrix product of m and n. (Search the web for a
     * definition.)
     */
    static double[][] product(double[][] m, double[][] n) {
        double[][] product = new double[m.length][n[0].length];

        int i, j, k;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < n[0].length; j++) {
                for (k = 0; k < m[0].length; k++)
                    product[i][j] += m[i][k] * n[k][j];
            }
        }

        return product;
    }

}
