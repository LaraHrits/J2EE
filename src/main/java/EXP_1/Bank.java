package EXP_1;

public class Bank {
    private int account;

    public Bank() {
        this.account = 1;
    }

    public void inc(){
        for (int i = 0; i < 20000; i++) {
            account += 2;
        }
        System.out.println("Increase: " + account);
    }

    public void dec(){
        for (int i = 0; i < 20000; i++) {
            account--;
        }
        System.out.println("Decrease : " + account);
    }
}