public class LeetCode_38_报数 {
    public String countAndSay(int n) {
        String str = "11";
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        if (n > 2) {
            for (int i=0; i<n-2; i++) {
                str = getString(str);
            }
        }
        return str;
    }
    public String getString(String str) {
        String str1 = "";
        int conut = 1;
        Go:
        for (int i = 0; i < str.length(); i++) {
            while (i < str.length() - 2) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        conut++;
                        continue Go;
                    } else {
                        str1 = str1 + conut + "" + str.charAt(i);
                        conut = 1;
                        continue Go;
                    }
                }
            }
            if (i == str.length() - 2) {
                if (str.charAt(str.length() - 2) == str.charAt(str.length() - 1)) {
                    conut++;
                    str1 = str1 + conut + str.charAt(str.length() - 2);
                } else {
                    str1 = str1 + conut + str.charAt(str.length() - 2) + 1 + str.charAt(str.length() - 1);
                }
            }

        }
        return str1;
    }
}
