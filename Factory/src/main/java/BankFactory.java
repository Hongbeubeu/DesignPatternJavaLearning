public class BankFactory {

    private BankFactory(){
    }

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return  new VietcomBank();
            case AGRIBANK:
                return new AgriBank();
            case BIDVBANK:
                return new BIDVBank();
            case VIETINBANK:
                return new VietinBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
