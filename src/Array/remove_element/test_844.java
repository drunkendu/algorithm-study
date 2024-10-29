package Array.remove_element;

public class test_844 {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean b = backspaceCompare(s, t);
        System.out.println(b);
    }

    public static boolean backspaceCompare(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char ch : S) {
            if (ch == '#' && sb1.length() > 0) {
                sb1.deleteCharAt(sb1.length() - 1);
            } else if (ch != '#') {
                sb1.append(ch);
            }
        }

        for (char ch : T) {
            if (ch == '#' && sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            } else if (ch != '#') {
                sb2.append(ch);
            }
        }

        if (sb1.toString().equals(sb2.toString()))
            return true;
        return false;
    }
}
