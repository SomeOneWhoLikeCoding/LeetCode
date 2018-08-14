public class LeetCode_028_实现strStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.indexOf(needle) >= 0) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode_028_实现strStr l = new LeetCode_028_实现strStr();
        System.out.println(l.strStr("mississippi","issip"));
    }
}
