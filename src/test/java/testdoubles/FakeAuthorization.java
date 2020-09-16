package testdoubles;

import java.util.ArrayList;
import java.util.HashMap;

public class FakeAuthorization implements Authorizer{
    private HashMap<String, Boolean> authorised = new HashMap<>();

    @Override
    public Boolean authorize(String username, String password) {
        return authorised.get(username);
    }


    public void addAuthorizationLogin(String username) {
        authorised.put(username, true);
    }
}
