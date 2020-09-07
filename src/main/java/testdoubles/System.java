package testdoubles;

public class System {
    private final Authorizer authorizer;

    public System(Authorizer authorizer) {
        this.authorizer = authorizer;
    }

    public int loginCount() {
        //returns number of logged in users
        return 0;
    }

    public boolean getAuthorization(String login, String password) {
        return this.authorizer.authorize(login, password);
    }
}
