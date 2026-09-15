package Language_fundamentals.Home_work1.mini_projects2;

public class Electricitybill {
    public static void main(String[] args){
        int unitConsumed = 80;
        int excess = 0;
        if(unitConsumed > 100){
            excess = unitConsumed - 100;
        }
        int cost = 0;
        int fixedCost = 5;
        int variableCost = 8;
        if(unitConsumed > 100) {
            cost = fixedCost * 100 + excess * variableCost;
        }
        if(unitConsumed < 100){
            cost = fixedCost*unitConsumed;
        }
        System.out.println("The bill for the month is " + cost);
    }
}
