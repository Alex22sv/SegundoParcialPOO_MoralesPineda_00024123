public class Paypal implements PaypalInterface{
    @Override
    public boolean validate(String username, String password) {
        return username.equals("alex22sv") && password.equals("1234");
    }
}