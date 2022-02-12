package advanced;

class Member{
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    public void printSalary(){
        System.out.println("Salary : " + salary);
    }

    public void generalInfo(){
        System.out.println("Name : " + name + "\n" +
                           "Age : " + age + "\n" +
                           "Phone : " + phoneNumber + "\n" +
                           "Adress : " + address + "\n");
    }
}

class Employee extends Member{
    protected String specialization;
}

class Manager extends Member {
    protected String department;
}

public class JobClass {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.name = "John";
        employee.age = 45;
        employee.phoneNumber = "+49 5342345234";
        employee.address = "Jemen";
        employee.salary = 2000;
        employee.specialization = "Electrical engineer";
        employee.generalInfo();

        manager.name = "John";
        manager.age = 56;
        manager.phoneNumber = "+49 434234233";
        manager.address = "Oman";
        manager.salary = 2500;
        manager.department = "Sales";
        manager.generalInfo();
    }

}

