
class Account {

    double calculateInterest(double principle, double rate, int time) {
        System.out.println("The interest calculator invoked");

        double amount = principle * (rate / 100) * time;

        return amount;
    }
}


// Savings Account
class SavingsAccount extends Account {

    String name;
    double rate;

    SavingsAccount(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    double calculateInterest(double principle, double rate, int time) {

        System.out.println("This is the Savings Account interest for " + name);

        double interest = principle * (rate / 100) * time;

        return interest;
    }
}


// Current Account
class CurrentAccount extends Account {

    String businessType;

    CurrentAccount(String businessType) {
        this.businessType = businessType;
    }

    @Override
    double calculateInterest(double principle, double rate, int time) {

        System.out.println(
            "Current Account is not eligible for interest: " + businessType
        );

        return 0;
    }
}


public class Main {

    public static void main(String[] args) {

        String name = "Karthik";
        double rate = 7.5;
        double principle = 75000.00;
        int time = 3;

        // Savings Account
        SavingsAccount s1 = new SavingsAccount(name, rate);

        double capital = s1.calculateInterest(
            principle,
            rate,
            time
        );

        System.out.println(
            "The interest earned in Savings Account: ₹" + capital
        );


        // Current Account
        String businessType = "Financial Services";

        CurrentAccount c1 = new CurrentAccount(businessType);

        double capital2 = c1.calculateInterest(
            principle,
            rate,
            time
        );

        System.out.println(
            "The interest earned in Current Account: ₹" + capital2
        );
    }
}

