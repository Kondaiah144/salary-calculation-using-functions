public class CalculateCostOfMeal {

    //declaring inputs in function using Paramenters
    public static void calculateTotalMealPrice( double listedMealPrice,
                                                double tipRate,
                                                double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args) {
       calculateTotalMealPrice(15, .5, .09);
       calculateTotalMealPrice(25, .10, .09);
    }
}
