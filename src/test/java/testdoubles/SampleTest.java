package testdoubles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {


    @Test
    public void should_loginCount_return_0() {
        //Arrange
        System system = new System(new DummyAuthorizer());

        //Act
        int count = system.loginCount();

        //Assert
        assertEquals(0, count);
    }

    @Test
    public void should_verify_authorized_person_with_fake() {
        //Given
        FakeAuthorization fakeAuthorization = new FakeAuthorization();
        System system = new System(fakeAuthorization);
        fakeAuthorization.addAuthorizationLogin("toto");

        //When
        boolean result = system.getAuthorization("toto", "toto");

        //Then
        assertEquals(true, result);

    }

    @Test
    public void should_getAuthorization_always_return_true() {
        //Arrange
        System system = new System(new StubAuthorizer());

        //Act
        Boolean result = system.getAuthorization("toto", "toto");

        //Assert
        assertEquals(true, result);
    }

    @Test
    public void should_verify_authorize_is_called_only_once() {
        //Arrange
        SpyAuthorizer spyAuthorizer = new SpyAuthorizer();
        System system = new System(spyAuthorizer);

        //Act
        system.getAuthorization("toto", "toto");

        //Assert
        assertEquals(1, spyAuthorizer.getNumerOfCall());
    }

    @Test
    public void should_verify_authorize_return_true() {
        //Arrange
        MockAuthorizer mockAuthorizer = new MockAuthorizer();
        System system = new System(mockAuthorizer);

        //Act
        system.getAuthorization("toto", "toto");

        //Assert
        assertEquals(true, mockAuthorizer.verify());
    }

}
