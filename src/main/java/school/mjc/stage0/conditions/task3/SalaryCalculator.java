package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {



        if (salary < 0) {
            System.out.println("wrong input!");

        } else if (salary <= 10000) {
            double salaryAfterTaxes = salary - (salary * 0.15d);
            System.out.println(salaryAfterTaxes);

        } else if (salary > 10000 && salary <= 20000) {
            double salaryAfterTaxes = salary - (salary * 0.18d);
            System.out.println(salaryAfterTaxes);

        } else if (salary > 20000) {
           double salaryAfterTaxes = salary - (salary * 0.20d);
            System.out.println(salaryAfterTaxes);
        }
    }
}
