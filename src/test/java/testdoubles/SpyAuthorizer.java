package testdoubles;

public class SpyAuthorizer implements Authorizer {
    private int numberOfCalls = 0;

    @Override
    public Boolean authorize(String username, String password) {
        numberOfCalls++;
        return true;
    }

    @Override
    public void addAuthorized(String username) {

    }

    public int numberOfauthorizeCall() {
        return numberOfCalls;
    }
}
