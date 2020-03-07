package tddstudy.step3;

import java.time.LocalDate;
import java.time.YearMonth;

public class PayData {
    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    public PayData() {
    }

    public PayData(LocalDate firstBillingDate, LocalDate billingDate, int payAmount) {
        this.firstBillingDate = firstBillingDate;
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate plusMonths(int month) {
        return billingDate.plusMonths(month);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean isNullFirstBillingDate() {
        return firstBillingDate == null;
    }

    public LocalDate expiryDateUsingFirstBillingDate() {
        final int dayOfFirstBilling = firstBillingDate.getDayOfMonth();
        LocalDate candidateExp = billingDate.plusMonths(addedMonths());

        if (isSameDayOfMonth(dayOfFirstBilling, candidateExp)) {
            final int dayLenOfCandiMon = lastDayOfMonth(candidateExp);
            if (dayLenOfCandiMon < dayOfFirstBilling) {
                return candidateExp.withDayOfMonth(dayLenOfCandiMon);
            }
        }
        return billingDate.plusMonths(addedMonths())
                          .withDayOfMonth(dayOfFirstBilling);
    }

    private int lastDayOfMonth(LocalDate candidateExp) {
        return YearMonth.from(candidateExp).lengthOfMonth();
    }

    private boolean isSameDayOfMonth(int dayOfFirstBilling, LocalDate candidateExp) {
        return dayOfFirstBilling != candidateExp.getDayOfMonth();
    }

    public int addedMonths() {
        return payAmount / 10000;
    }

    public static class Builder {
        private PayData data = new PayData();

        public Builder() {
        }

        public Builder billingDate(LocalDate billingDate) {
            data.billingDate = billingDate;
            return this;
        }

        public Builder payAmount(int payAmount) {
            data.payAmount = payAmount;
            return this;
        }

        public PayData build() {
            return data;
        }

        public Builder firstBillingDate(LocalDate firstBillingDate) {
            data.firstBillingDate = firstBillingDate;
            return this;
        }
    }
}
