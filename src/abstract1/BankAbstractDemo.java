package abstract1;

abstract class Bank {
    abstract void rateOfInterest();
}

class HDFC extends Bank {
    void rateOfInterest() {
        System.out.println("HDFC interest is 7%");
    }
}

public class BankAbstractDemo {
    public static void main(String[] args) {
        Bank b = new HDFC();
        b.rateOfInterest();
    }
}

