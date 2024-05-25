public class Stripe {
    private String name;

    public Stripe() {
        this.name = "stripe";
    }

    public boolean validateService(String username, String password, String token){
        return (username.equals("alex22sv")) && (password.equals("1234")) && (token.equals("alex22sv:stripe"));
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
