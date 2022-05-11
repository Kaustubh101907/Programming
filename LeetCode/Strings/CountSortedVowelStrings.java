package LeetCode.Strings;

public class CountSortedVowelStrings {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countVowelStrings(n));
    }

    public static int countVowelStrings(int n) {
        n++;
        int ans = n*(n+1)*(n+2)*(n+3)/24;
        return ans;
    }
}
