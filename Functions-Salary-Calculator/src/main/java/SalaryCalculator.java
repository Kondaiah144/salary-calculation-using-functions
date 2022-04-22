public class SalaryCalculator {

//public static void employeeSalary( double hours, double hourlyPay) {
//  double totalworkweeks = hours * 54;
//  double pay = hourlyPay;
//  double grosssalary = totalworkweeks * pay;
//System.out.println("Employee's gross yearly Salary: " + grosssalary);
//}
//public static void main(String[] args) {
//employeeSalary(40, 40);
//  }


    public static double grosssalaryCaluculator(double hoursPerWeek,
                                                double amountPerHour,
                                                int vacationDays){
        // to check the hours per week is not negative..use if condition
        //when we return value to -1, it means invalid
        if (hoursPerWeek < 0) {
            return -1;
        }
        //if amount per hour is zero

        if (amountPerHour < 0) {
            return -1;
        }
        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime = vacationDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unpaidTime;
    }
    public static void main(String[] args) {
        //Make sure hours per week is not negative value.
      double salary = grosssalaryCaluculator(40, 60, 8);
        System.out.println(salary);
    }


}
