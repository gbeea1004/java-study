package tddstudy.step2;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String password) {
        if (password == null || password.isEmpty()) {
            return PasswordStrength.INVALID;
        }
        int meterCount = 0;
        if (password.length() >= 8) meterCount++;
        if (isContainsNum(password)) meterCount++;
        if (isContainsUpper(password)) meterCount++;

        if (meterCount == 1) return PasswordStrength.WEAK;
        if (meterCount == 2) return PasswordStrength.NORMAL;
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
