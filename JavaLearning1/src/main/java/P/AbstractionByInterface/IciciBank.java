package P.AbstractionByInterface;

public class IciciBank implements UKBank,USABank,AusBank {
    @Override
    public void debitCard() {
        System.out.println("Icici Bank-----Debit card");

    }

    @Override
    public void savingAccount() {
        System.out.println("Icici Bank-----Saving Account");

    }

    @Override
    public void freeCashWithdrawal() {
        System.out.println("Icici Bank-----Free Cash Withdrawals");
        System.out.println("                  max withdrawl 1000");

    }

    @Override
    public void chequeBook() {
        System.out.println("Icici Bank-----Cheque Book");

    }
}
