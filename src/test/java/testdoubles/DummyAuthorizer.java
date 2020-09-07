package testdoubles;

public class DummyAuthorizer implements Authorizer {
    @Override
    public Boolean authorize(String username, String password) {
        return null;
    }

    @Override
    public void addAuthorized(String username) {

    }
}
