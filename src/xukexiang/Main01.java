package xukexiang;

public class Main01 {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        if (array != null && rows >= 0 && cols >= 0) {
            int row = 0;
            int col = cols - 1;
            while (row < rows && col >= 0) {
                int temp = array[row][col];
                if (target == temp) {
                    return true;
                } else if (target > temp) {
                    row++;
                } else {
                    col--;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

    }
}
