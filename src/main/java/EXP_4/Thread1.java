package EXP_4;

public class Thread1 implements Runnable {
    private final Bank bank;

    public Thread1(Bank bank) {

        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank){
            for (int i = 0; i < 20000; i++) {
                bank.setAccount(bank.getAccount() + 2);
            }
            System.out.println("Increase: " + bank.getAccount());
        }
    }
}
