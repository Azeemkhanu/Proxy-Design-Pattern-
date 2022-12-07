public class Main {
    public static void main(String[] args) {
        Bank bank=new ProxyBank();
        try {
            bank.withDrawMoney("Azeem");
            bank.withDrawMoney("james");
        } catch (Exception e) {
            System.out.println(e.getMessage());
    }
    }
}
