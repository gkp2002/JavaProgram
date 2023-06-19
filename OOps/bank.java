package OOps;
class Account{
    public String name;
    protected String email;
    private String Password;
    public String getPassword(){
          return Password;
    }
    public void setPassword( String pass){
        this.Password = pass;
    }
}
public class bank {
    public static void main(String args[]){
        Account ac = new Account();
        ac.name ="Rahul";
        ac.email = "Gajanank015@gmail.com";
        ac.setPassword("gajana");
        System.out.println(ac.getPassword());

    }

}
