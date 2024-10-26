package Excercise_5;

public class Run {
    public static void main(String[] args) {

        Employee employee = new Employee("beka", 5000);
        System.out.println("მომხმარებლის ინფორმაცია: ");
        employee.displayDetails();

        System.out.println();

        Manager manager = new Manager("nika", 3700, "ხარისხის უზრუნველყოფა ");
        System.out.println("მენეჯერის ინფორმაცია ");
        manager.displayDetails();
    }
}
