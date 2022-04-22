public class DivideMealPrice {

    //declaring inputs in function using Paramenters
    //"void" always a return type, it will retun to something or nothing
    //For meal price - we wanted it to return to variable. so, here variable is "double"
    //change "void" to double", this is Instance variable
    public static double calculateTotalMealPrice( double listedMealPrice,
                                                double tipRate,
                                                double taxRate) { //instance variable "void to double"
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
        return result;
    }


    public static void main(String[] args) {

        double groupTotalMealPrice = calculateTotalMealPrice(100,.2, .09);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice/ 5; //dividing into 5
        System.out.println(individualMealPrice);
    }
}
