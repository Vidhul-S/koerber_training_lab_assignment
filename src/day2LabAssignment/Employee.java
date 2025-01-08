package day2LabAssignment;

public class Employee {

    int id;
    String firstName;
    String lastName;
    int salary;
    public void Employee(int id,String firstName,String lastName,int salary){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID(){

        return this.id;
    }
    public String getFirstName(){

        return new String(this.firstName);
    }
    public String getLastName(){

        return new String(this.lastName);
    }
    public int getSalary(){

        return this.salary;
    }
    public void setSalary(int salary){

        this.salary=salary;
    }
    public int getAnnualSalary(){

        return (this.salary)*12;
    }
    public int raisSalary(int percent){
        this.salary += this.salary*percent/100;
        return this.salary;
    }
    @Override
    public String toString(){
        return "Employee[id="+this.id+",name="+this.firstName+this.lastName+",salary="+this.salary;
    }
}
