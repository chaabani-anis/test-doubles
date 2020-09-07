package testdoubles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void should_verify_authorize_is_called() {

    }

    @Test
    public void should_verify_authorize_return_true() {

    }

}
