// 41. Palindrome Two Pointer
// Leetcode 125 - Valid Palindrome
// Time Complexity = O(n) (best possible)
// Space Complexity = O(1)

public class Palindrome_TwoPointer {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;   // not palindrome
            }
            left++;
            right--;
        }
        return true;   // palindrome
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
