class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        int[] last = new int[26];
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (visited[ch - 'a'])
                continue;
            while (sb.length() > 0) {
                char prev = sb.charAt(sb.length() - 1);
                if (prev > ch && last[prev - 'a'] > i) {
                    sb.deleteCharAt(sb.length() - 1);
                    visited[prev - 'a'] = false;
                } else {
                    break;
                }
            }
            sb.append(ch);
            visited[ch - 'a'] = true;
        }
        return sb.toString();
    }
}