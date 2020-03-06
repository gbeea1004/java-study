package tddstudy.step3;

import java.time.LocalDate;

public class ExpiryDateCalculator {
    public LocalDate calculateExpiryDate(PayData payData) {
        if (!payData.isNullFirstBillingDate()) {
            return payData.changeBillingDate();
        }
        return payData.plusMonths(1);
    }
}
