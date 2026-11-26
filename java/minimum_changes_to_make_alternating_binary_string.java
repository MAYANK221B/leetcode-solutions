// ======================================
// LeetCode Problem: minimum changes to make alternating binary string
// Language: java
// Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
// Synced by: LinkCode
// Date: 11/25/2026, 6:50:30 PM
// ======================================


class Solution {
    public int minOperations(String s) {
        char c=s.charAt(0);
        int count =0;
        for(int i =0 ;i<s.length();i++){
            if(i+1<s.length())
                if(c==s.charAt(i+1)){
                    count++;
                    if(c=='1')
                        c='0';
                    else
                        c='1';
                }
                else
                    c= s.charAt(i+1);
        }
        return Math.min(count, s.length()-count);
    }
}