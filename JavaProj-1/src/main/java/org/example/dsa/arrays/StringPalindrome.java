package org.example.dsa.arrays;

public class StringPalindrome {

    public boolean isPalindrome(String word)
    {
        char []chArray = word.toCharArray();
        int start = 0, end = chArray.length-1;
        while(start<end)
        {
            if(chArray[start]!=chArray[end])
                return false;

            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        StringPalindrome palindrom = new StringPalindrome();
        if ((!palindrom.isPalindrome("madam"))) {
            System.out.println("The given string is not a palindrome");
        } else {
            System.out.println("The given string is palindrom3");
        }
    }
}
