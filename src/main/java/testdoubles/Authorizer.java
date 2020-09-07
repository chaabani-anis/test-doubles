package testdoubles;

public interface Authorizer {
    Boolean authorize(String username, String password);
    void addAuthorized(String username);
}
