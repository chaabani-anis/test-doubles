package testdoubles;

public class StubAuthorizer implements Authorizer {
    @Override
    public Boolean authorize(String username, String password) {
        return true;
    }
}
