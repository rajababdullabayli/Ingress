package Payment;

public class Payment {
    private String paymentId;
    private double amount;
    private String currency;
    private double commissionPercent;
    private boolean successful;
    private double cashbackPercent;
    private double vat;
    private double discountPercent;
    private double refundAmount;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public double getCashbackPercent() {
        return cashbackPercent;
    }

    public void setCashbackPercent(double cashbackPercent) {
        this.cashbackPercent = cashbackPercent;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public double calculateTotalAmount() {
        double total = amount + (amount * commissionPercent / 100);
        return total;
    }

    public boolean getStatus(double amount) {
        if (amount > 0) {
            successful = true;
        } else {
            successful = false;
        }

        return successful;
    }

    public void printInfo() {
        System.out.println("Payment Id: " + paymentId);
        System.out.println("Payment Amount: " + amount);
        System.out.println("Payment Currency: " + currency);
        System.out.println("Payment Status :" + getStatus(amount));
    }

    public double calculateCashback() {
        double cashback = amount * cashbackPercent / 100;
        return cashback;
    }

    public void printReceipt() {
        double netPayment = calculateTotalAmount() - calculateCashback();
        System.out.println("Payment : " + paymentId);
        System.out.println("Amount : " + amount);
        System.out.println("Cashback : " + cashbackPercent);
        System.out.println("Net Payment : " + netPayment);
    }

    public boolean isValidAmount() {
        if (amount > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidCurrency() {
        if (currency == "AZN" || currency == "USD" || currency == "EUR") {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPaymentValid() {
        boolean validAmount = isValidAmount();
        boolean validCurrency = isValidCurrency();
        if (validAmount == true && validCurrency == true) {
            System.out.println("Amount " + amount);
            System.out.println("Currency " + currency);
            System.out.println();
            return true;
        } else {
            return false;
        }
    }

    public String getMaskedPaymentId() {
        String newPaymentId = "";
        int length = paymentId.length();

        for (int i = 0; i < length; i++) {
            if (i >= length - 4) {
                newPaymentId += paymentId.charAt(i);
            } else {
                newPaymentId += '*';
            }
        }
        return newPaymentId;
    }

    public double calculateVat() {
        vat = amount * vat / 100;
        return vat;
    }

    public double calculateFinalAmount() {
        double result = amount + calculateVat();
        return result;
    }

    public void printSummary() {
        System.out.print("Payment Id: " + getMaskedPaymentId());
        System.out.println();
        System.out.print("Amount: " + amount);
        System.out.println();
        System.out.print("Vat: " + calculateVat());
        System.out.println();
        System.out.print("Final Amount: " + calculateFinalAmount());
    }

    public double calculateDiscount() {
        double discount = amount * discountPercent / 100;
        System.out.print("Discount Amount: " + discount);
        return discount;
    }

    public double calculateAmountAfterDiscount() {
        double calculateAmount = amount - calculateDiscount();
        System.out.println("Amount After Discount: " + calculateAmount);
        return calculateAmount;
    }

    public boolean isLargePayment() {
        if (amount > 1000) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateRemainingAmount() {
        double remaining = amount - refundAmount;
        return remaining;
    }

    public void printRefundInfo() {
        System.out.println("Payment: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Refund " + refundAmount);
        System.out.println("Remaining: " + calculateRemainingAmount());

    }

    public String getCurrencySymbol() {
        if (currency.equals("AZN")) {
            return "₼";
        }
        else if (currency.equals("USD")) {
            return "$";
        }
        else if (currency.equals("EUR")) {
            return "€";
        }
        else {
            return "?";
        }
    }

    public void printAmountWithSymbol(){
        String symbolCurrency = getCurrencySymbol();
        System.out.println("Amount: "+symbolCurrency+amount);
    }

    public String getRiskLevel(){
        if (amount<500){
            return "LOW";
        }
        else if(amount>=500 && amount<2000){
            return "MEDIUM";
        }
        else {
            return "HIGH";
        }
    }

    public void printRiskReport(){
        String riskLevel = getRiskLevel();
        System.out.println("Payment Id: "+paymentId);
        System.out.println("Amount: "+amount);
        System.out.println("Risk Level: "+riskLevel);
    }
}
