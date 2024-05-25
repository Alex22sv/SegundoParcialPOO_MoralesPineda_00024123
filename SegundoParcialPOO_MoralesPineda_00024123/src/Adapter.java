public class Adapter implements PaypalInterface{
    private Stripe stripe = new Stripe();
    @Override
    public boolean validate(String username, String password) {
        String token = username+":"+stripe.getName();
        return stripe.validateService(username, password, token);
    }
}
