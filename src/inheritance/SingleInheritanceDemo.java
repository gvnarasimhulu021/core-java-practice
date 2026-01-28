package inheritance;

class Employee {
    int salary = 30000;
}

class Developer extends Employee {
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Developer d = new Developer();
        System.out.println(d.salary);
    }
}

