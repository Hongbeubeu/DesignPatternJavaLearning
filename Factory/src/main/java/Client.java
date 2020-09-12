public class Client {
    public static void main(String[] args){
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());
        bank = BankFactory.getBank(BankType.AGRIBANK);
        System.out.println(bank.getBankName());
        bank = BankFactory.getBank(BankType.BIDVBANK);
        System.out.println(bank.getBankName());
        bank = BankFactory.getBank(BankType.VIETINBANK);
        System.out.println(bank.getBankName());
        bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());

    }
}
