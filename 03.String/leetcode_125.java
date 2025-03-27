class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "").toLowerCase());
        String origin = sb.toString();

        sb.reverse();

        System.out.println(origin);
        System.out.println(sb);

        return sb.toString().equals(origin);
    }
}