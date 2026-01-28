package inheritance;

class Company {
    void companyName() {
        System.out.println("ABC Company");
    }
}

class Team extends Company {
    void teamName() {
        System.out.println("Java Team");
    }
}

class Member extends Team {
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Member m = new Member();
        m.companyName();
        m.teamName();
    }
}
