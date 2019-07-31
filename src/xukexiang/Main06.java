package xukexiang;

import java.util.Arrays;

public class Main06 {
    public int minNumberInRotateArray(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
