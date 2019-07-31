package xukexiang;

public class Main11 {
    public int NumberOf1(int n) {
        String str =  Integer.toBinaryString(n);
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                num++;
            }
        }
        return num;
    }
}
