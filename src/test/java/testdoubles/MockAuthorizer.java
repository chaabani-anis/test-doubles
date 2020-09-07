package testdoubles;

public class MockAuthorizer implements Authorizer {
    private boolean authorizeWasCalled = false;

    @Override
    public Boolean authorize(String username, String password) {
        this.authorizeWasCalled = true;
        return true;
    }

    @Override
    public void addAuthorized(String username) {

    }

    public Boolean verify(){
        return authorizeWasCalled;
    }
}
