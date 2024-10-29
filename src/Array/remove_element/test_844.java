package Array.remove_element;

public class test_844 {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean b = backspaceCompare(s, t);
        System.out.println(b);
    }

    public static boolean backspaceCompare(String s, String t) {
        int sSkipNum = 0; // 记录S的#数量
        int tSkipNum = 0; // 记录T的#数量
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int i = S.length - 1;
        int j = T.length - 1;
        while (true) {
            while (i >= 0) { // 从后向前，消除S的#
                if (S[i] == '#') sSkipNum++;
                else {
                    if (sSkipNum > 0) sSkipNum--;
                    else break;
                }
                i--;
            }
            while (j >= 0) { // 从后向前，消除T的#
                if (T[j] == '#') tSkipNum++;
                else {
                    if (tSkipNum > 0) tSkipNum--;
                    else break;
                }
                j--;
            }
            // 后半部分#消除完了，接下来比较S[i] != T[j]
            if (i < 0 || j < 0) break; // S 或者T 遍历到头了
            if (S[i] != T[j]) return false;
            i--;
            j--;
        }
        // 说明S和T同时遍历完毕
        if (i == -1 && j == -1) return true;
        return false;
    }
}
