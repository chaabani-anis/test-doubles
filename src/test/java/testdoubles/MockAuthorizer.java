package testdoubles;

public class MockAuthorizer implements Authorizer{
    private boolean authorizeWasCalled = false;

    @Override
    public Boolean authorize(String username, String password) {
        authorizeWasCalled = true;
        return true;
    }

    public Boolean verify(){
        return authorizeWasCalled;
    }
}
