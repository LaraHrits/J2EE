package EXP_2;

public class Thread2 implements Runnable{
    private Bank bank;

    public Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.dec();
    }
}