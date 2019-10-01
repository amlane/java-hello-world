package employeeApp;

public class Main {

    // fields = information
    // methods = do behavior

    public static void workWithData() {
        Healthplan h1 = new Healthplan("My Health Plan 1");
        Healthplan h2 = new Healthplan("My Health Plan 2");

        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("Amanda", "Lane", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("Herman", "Catz", 55000, true, c1.id, h2.getId());

        System.out.println("*** Query Data ***");
        System.out.println(emp1.toString());
        System.out.println(c1);
        System.out.println(c1.debt);
        c1.debt = c1.debt - 10;
        System.out.println(c1.debt);

        // System.out.println("*** Data Types - Numbers ***");
        // System.out.println("Original divided 5 " + (c1.debt / 5));
        // System.out.println("Original mod 2 " + (c1.debt % 2));
        // System.out.println("Original divided 7 " + (c1.debt / 7));
        // System.out.println("Original divided 7 " + (c1.debt / 7.0));
        // System.out.println("Original divided 7 " + ((double) c1.debt / 7));
        // System.out.println();
        // String myStr = "100";
        // System.out.println("Debt: " + myStr + c1.debt);
        // int tempInt = Integer.parseInt(myStr) + c1.debt;
        // double tempDouble = emp1.getSalary() + 1000;

        // System.out.println("Debt: " + tempInt);
        // System.out.println("Salary: " + tempDouble);
    }

    // must have this in every Java Application
    public static void main(String[] args) {
        workWithData();
    }
}