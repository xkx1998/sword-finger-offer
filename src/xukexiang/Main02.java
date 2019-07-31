package xukexiang;

public class Main02 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        String s = "%20";
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == ' '){
                sb.append(s);
            }else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
