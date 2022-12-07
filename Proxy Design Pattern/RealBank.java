public class RealBank implements Bank{

    @Override
    public void withDrawMoney(String clietName) throws Exception {
        System.out.println(clietName+" Withdrawing money from the ATM...");
        
    }
    
}
