import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank{
    private RealBank bank=new RealBank();
    private static List<String> bannedClient;

    static{
        bannedClient=new ArrayList<>();
        bannedClient.add("james");
        bannedClient.add("Mike");
        bannedClient.add("Jhonson");
        bannedClient.add("Khanu");

    }
    
    @Override
    public void withDrawMoney(String clietName) throws Exception {
        if(bannedClient.contains(clietName.toLowerCase())){
            System.out.println(clietName+" Access Denied! You are banned!");
        }else{
            bank.withDrawMoney(clietName);
        }
    }

    
}
