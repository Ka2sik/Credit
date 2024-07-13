public class CreditPaymentService {

    public int calculate(int creditAmount, int yearsToReturn) {

        int monthsToReturn = yearsToReturn * 12;
        double monthlyPercent = 9.99 / 100 / 12;
        double monthlyPayment = creditAmount * monthlyPercent * Math.pow((1 + monthlyPercent), monthsToReturn) / (Math.pow((1 + monthlyPercent), monthsToReturn) - 1);
        return (int) monthlyPayment;
    }
}
