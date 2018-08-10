public class LeetCode_6_Z字形变换 {
    public String convert(String s, int numRows) {
        String str = "";
        if (numRows == 1) {
            return s;
        }
        int count = numRows * 2 - 2;
        for (int i=0; i<numRows; i++) {
            for (int j=i; j<s.length(); j=j+count) {
                str = str + s.charAt(j);
                if (i != 0 && i != numRows -1 && (j - 2*i + count) < s.length()) {
                    str = str + s.charAt(j - 2*i + count);
                }
            }
        }
        return str;
    }
}
