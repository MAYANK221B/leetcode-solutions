// ======================================
// LeetCode Problem: minimum changes to make alternating binary string
// Language: java
// Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
// Synced by: LinkCode
// Date: 11/25/2026, 6:53:26 PM
// ======================================


class Solution {
    public int minOperations(String s) {
        char c=s.charAt(0);
        int count =0;
        for(int i =1 ;i<s.length();i++){
                if(c==s.charAt(i)){
                    count++;
                    if(c=='1')
                        c='0';
                    else
                        c='1';
                }
                else
                    c= s.charAt(i);
        }
        return Math.min(count, s.length()-count);
    }
}