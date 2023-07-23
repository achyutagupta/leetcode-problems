class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        int n = s.length();
        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasE = false;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            // Check for valid signs (+/-) at the start
            if (i == 0 && (ch == '+' || ch == '-')) {
                continue;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (ch == '.') {
                // Check for dot ('.') occurrences
                if (hasDot || hasE) {
                    // More than one dot or a dot after 'e' is not allowed
                    return false;
                }
                hasDot = true;
            } else if (ch == 'e' || ch == 'E') {
                // Check for 'e' or 'E' occurrences
                if (!hasDigit || hasE || i == n - 1) {
                    // No digits before 'e' or 'E', multiple 'e' or 'E', or 'e' at the end is not allowed
                    return false;
                }
                hasE = true;
                // Reset hasDigit to ensure there is at least one digit after 'e' or 'E'
                hasDigit = false;
            } else if (ch == '+' || ch == '-') {
                // Check for valid signs (+/-) after 'e' or 'E'
                if (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    // '+' or '-' not appearing after 'e' or 'E'
                    return false;
                }
            } else {
                // Any other character is not allowed
                return false;
            }
        }

        // If there are no digits, it's not a valid number
        return hasDigit;
    }
}
