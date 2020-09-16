package testdoubles;

public class SpyAuthorizer implements Authorizer{
    private int numerOfCall = 0;

    @Override
    public Boolean authorize(String username, String password) {
        numerOfCall++;
        return true;
    }

    public int getNumerOfCall() {
        return numerOfCall;
    }
}
