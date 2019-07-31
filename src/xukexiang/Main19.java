package xukexiang;

import java.util.ArrayList;

/**
 * 题目：顺时针打印矩阵
 * 描述：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * <p>
 * 思路：控制好左右边界和上下边界
 */
public class Main19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (matrix == null) return list;
        int left_y = 0;
        int right_y = matrix[0].length - 1;
        int top_x = 0;
        int boom_x = matrix.length - 1;

        while (left_y < right_y && top_x < boom_x) {
            for (int i = left_y; i <= right_y; i++) {
                list.add(matrix[top_x][i]);
            }

            for (int i = top_x + 1; i <= boom_x; i++) {
                list.add(matrix[i][right_y]);
            }

            for (int i = right_y - 1; i >= left_y; i--) {
                list.add(matrix[boom_x][i]);
            }

            for (int i = boom_x - 1; i >= top_x + 1; i--) {
                list.add(matrix[i][left_y]);
            }

            left_y++;
            right_y--;
            top_x++;
            boom_x--;
        }

        if (left_y == right_y && top_x == boom_x) {
            list.add(matrix[top_x][right_y]);
        }

        if (left_y == right_y && top_x < boom_x) {
            for (int i = top_x; i <= boom_x; i++) {
                list.add(matrix[i][left_y]);
            }
        }

        if (left_y < right_y && top_x == boom_x) {
            for (int i = left_y; i <= right_y; i++) {
                list.add(matrix[top_x][i]);
            }
        }
        return list;
    }
}
