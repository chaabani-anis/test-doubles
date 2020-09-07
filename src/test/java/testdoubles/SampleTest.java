package testdoubles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SampleTest {


    @Test
    public void should_loginCount_return_0() {
        //Dummy
        System system = new System(new DummyAuthorizer());

        assertEquals(0, system.loginCount());
    }

    @Test
    public void should_verify_authorized_person_with_fake() {

        //Fake
        Authorizer fakeAuthorizer = new FakeAuthorizer();
        fakeAuthorizer.addAuthorized("toto");

        System system = new System(fakeAuthorizer);

        assertEquals(true, system.getAuthorization("toto", "toto"));
    }

    @Test
    public void should_getAuthorization_always_return_true() {
        //Stub
        System system = new System(new StubAuthorizer());

        assertEquals(true, system.getAuthorization("toto", "toto"));
    }

    @Test
    public void should_verify_authorize_is_called_only_once() {
        //Spy
        SpyAuthorizer spyAuthorizer = new SpyAuthorizer();
        System system = new System(spyAuthorizer);
        system.getAuthorization("toto", "toto");

        assertEquals(1, spyAuthorizer.numberOfauthorizeCall());
    }

    @Test
    public void should_verify_authorize_return_true() {
        MockAuthorizer mockAuthorizer = new MockAuthorizer();
        System system = new System(mockAuthorizer);
        system.getAuthorization("toto", "toto");

        assertEquals(true, mockAuthorizer.verify());

    }

}
