public class ReverseVowels {

    public static String reverseVowels(String s) {
        if (s == null || s.length() <= 1) return s;

        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer to the previous vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move inward
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "leetcode";
        String input3 = "AEIOU";

        System.out.println(reverseVowels(input1)); // Output: "holle"
        System.out.println(reverseVowels(input2)); // Output: "leotcede"
        System.out.println(reverseVowels(input3)); // Output: "UOIEA"
    }
}
