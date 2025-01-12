package day2LabAssignment.employeePaySystem;

import java.util.ArrayList;

public class PaySystem {
    private ArrayList<Employee> employees;

    public PaySystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public void increaseSalaries() {
        for (Employee emp : employees) {
            if (emp instanceof SalaryPayment) {
                ((SalaryPayment) emp).setIncreasedSalary();
            }
        }
    }

    public static void main(String[] args) {

        PaySystem paySystem = new PaySystem();

        SalariedEmployee salariedEmp = new SalariedEmployee(1, "John", "Doe", 500);
        HourlyEmployee hourlyEmp = new HourlyEmployee(2, "Jane", "Smith", 20, 40);
        ContractEmployee contractEmp = new ContractEmployee(3, "Alice", "Brown", 10, 2000);
        //sample tests
        paySystem.addEmployee(salariedEmp);
        paySystem.addEmployee(hourlyEmp);
        paySystem.addEmployee(contractEmp);
        System.out.println("Before Increment:");
        paySystem.displayAllEmployees();
        SalariedEmployee.setIncrement(10);
        HourlyEmployee.setIncrement(5);
        ContractEmployee.setIncrement(7);
        paySystem.increaseSalaries();
        System.out.println("\nAfter Increment:");
        paySystem.displayAllEmployees();
    }
}
