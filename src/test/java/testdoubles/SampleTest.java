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
    public void should_getAuthorization_with_fake_object() {

        //Fake
        Authorizer fakeAuthorizer = new FakeAuthorizer();
        fakeAuthorizer.addAuthorized("toto");

        System system = new System(fakeAuthorizer);

        assertEquals(true, system.getAuthorization("toto", "toto"));
    }

    @Test
    public void should_getAuthorization_with_stub() {

    }

    @Test
    public void should_verify_authorize_is_called() {

    }

    @Test
    public void should_verify_authorize_return_true() {

    }

}
