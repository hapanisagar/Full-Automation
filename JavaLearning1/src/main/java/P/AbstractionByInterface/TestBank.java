package P.AbstractionByInterface;

public class TestBank {
    public static void main(String[] args) {
        IciciBank ic= new IciciBank();
        ic.savingAccount();
        ic.freeCashWithdrawal();
        ic.chequeBook();
        ic.debitCard();


    }
}
