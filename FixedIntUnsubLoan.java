package assignment01;

/*
    Bradley Estus
    B00780491
    Class FixedIntUnsubLoan, for Assignment01.
 */

public class FixedIntUnsubLoan
{

    private double originalAmount;
    private double interestRate;
    private int nonPayYears;
    private double repayAmount;

    /**
     * Constructor for Fixed Interest Unsubsidized (Student) Loan
     * @param originalAmount Original loan value
     * @param interestRate Loan interest rate (APR)
     * @param nonPayYears Years of no payment
     * @param repayAmount Monthly payment amount
     */

    public FixedIntUnsubLoan(double originalAmount, double interestRate, int nonPayYears, double repayAmount)
    {
        this.originalAmount = originalAmount;
        this.interestRate = interestRate;
        this.nonPayYears = nonPayYears;
        this.repayAmount = repayAmount;
        //Consistent variable names with this. is superior, change my mind.
    }

    /**
     * Fetches the original loan value
     * @return original loan value
     */
    public double getOriginalAmount()
    {
        return originalAmount;
    }

    /**
     * Fetches the interest rate (APR)
     * @return interest rate, APR
     */
    public double getInterestRate()
    {
        return interestRate;
    }

    /**
     * Fetches the number of non paying years
     * @return non paying years of loan
     */
    public int getNonPayYears()
    {
        return nonPayYears;
    }

    /**
     * Fetches amount per loan payment
     * @return Repayment amount
     */
    public double getRepayAmount()
    {
        return repayAmount;
    }

    /**
     * Calculates and returns the loan balance after given months
     * @param months months into loan period
     * @return Loan balance
     */
    public double getBalanceAfter(int months)
    {
        double amount = originalAmount;
        if(months <= nonPayYears*12)
        {
            for (int i = 0; i < months; i++)
            {
                amount += amount*(interestRate / 1200.0);
            }
        }else
            {
            for(int i = 0; i < 12 * nonPayYears; i++)
            {
                amount += amount*(interestRate / 1200.0);
            }
            for(int i = 0; i < months - 12 * nonPayYears; i++)
            {
                amount -= repayAmount;
                amount += amount*(interestRate / 1200.0);
            }
        }
        return amount;
    }

    /**
     * Calculates the necessary time to fully repay the loan
     * @return months required to pay loan
     */
    public int monthsToPayLoan()
    {
        int months = 0;
        double amountRemaining = originalAmount;
        while(amountRemaining > 0)
        {
            amountRemaining = getBalanceAfter(months);
            months++;
        }
        return months-1;
    }

    /**
     * Calculates the amount required to repay a loan, given a number of months.
     *@param originalAmount Original loan value
     * @param interestRate Loan interest rate (APR)
     * @param nonPayYears Years of no payment
     * @param desiredPaymentYears Number of years wanted on loan
     * @return Suggested payment amount
     */
    public static double repayAmountCalculator(double originalAmount, double interestRate, int nonPayYears, int desiredPaymentYears)
    {
        double payments = originalAmount/(12*desiredPaymentYears);
        var test = new FixedIntUnsubLoan(originalAmount,interestRate,nonPayYears,payments);
        while(test.monthsToPayLoan()>12*(nonPayYears+desiredPaymentYears))
        {
            payments += 0.01;
            test = new FixedIntUnsubLoan(originalAmount, interestRate, nonPayYears, payments);
        }
        return payments;
    }
}
