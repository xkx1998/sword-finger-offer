package xukexiang;

/**
 * 剑指offer13题
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Main13 {
    /**
     * 复杂度：O(n),My Way
     * 算法思路：创建一个新数组，再遍历两遍原数组
     * 一次找到奇数，一次找偶数，再把新数组赋值到原数组中
     * @param array
     */
//    public void reOrderArray(int[] array) {
//        int len = array.length;
//        int[] result = new int[len];
//        int idx = 0;
//        for (int i = 0; i < len; i++) {
//            if (array[i] % 2 != 0) {
//                result[idx++] = array[i];
//            }
//        }
//
//        for (int i = 0; i < len; i++) {
//            if (array[i] % 2 == 0) {
//                result[idx++] = array[i];
//            }
//        }
//
//        for (int i = 0;i < len;i++) {
//            array[i] = result[i];
//        }
//    }

    /**
     * 优化版
     * 直接在原数组上操作
     * 从数组第二个元素开始遍历，直到找到一个奇数
     * 找到奇数后，再遍历奇数前面的元素，找到是否有偶数
     * 如果有偶数就与奇数调换位置，起始奇数的下标也要替换
     * 如果遇到前面有奇数说明前面不可能有偶数了，就break
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 1) return;
        int len = array.length;
        for (int i = 1; i < len; i++) {
            if (array[i] % 2 != 0) {
                int index = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] % 2 == 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    } else {
                        break;
                    }
                    i = j;
                }
                i = index;
            }
        }
    }
}
