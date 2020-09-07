package testdoubles;

import java.util.HashMap;
import java.util.Map;

public class FakeAuthorizer implements Authorizer {
    HashMap<String, Boolean> authorized = new HashMap<>();

    public void addAuthorized(String username){
        authorized.put(username, true);
    }

    @Override
    public Boolean authorize(String username, String password) {
        return authorized.get(username);
    }
}
