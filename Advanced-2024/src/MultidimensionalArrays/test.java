package MultidimensionalArrays;

public class test {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i] + " outter");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j] + " innner");
            }
        }
    }
}
