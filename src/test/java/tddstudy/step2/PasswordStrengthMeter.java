package tddstudy.step2;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String password) {
        if (password == null || password.isEmpty()) {
            return PasswordStrength.INVALID;
        }
        boolean lengthEnough = password.length() >= 8;
        boolean containsNum = isContainsNum(password);
        boolean containsUpper = isContainsUpper(password);

        if (!containsNum && !containsUpper && lengthEnough) {
            return PasswordStrength.WEAK;
        }
        if (containsNum && !containsUpper && !lengthEnough) {
            return PasswordStrength.WEAK;
        }
        if (!containsNum && containsUpper && !lengthEnough) {
            return PasswordStrength.WEAK;
        }

        if (!lengthEnough) return PasswordStrength.NORMAL;
        if (!containsNum) return PasswordStrength.NORMAL;
        if (!containsUpper) return PasswordStrength.NORMAL;
        return PasswordStrength.STRONG;
    }

    private boolean isContainsUpper(String password) {
        for (char no : password.toCharArray()) {
            if (Character.isUpperCase(no)) {
                return true;
            }
        }
        return false;
    }

    private boolean isContainsNum(String password) {
        for (char no : password.toCharArray()) {
            if ('0' <= no && no <= '9') {
                return true;
            }
        }
        return false;
    }
}
