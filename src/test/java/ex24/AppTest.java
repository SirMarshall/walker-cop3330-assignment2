package ex24;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest extends TestCase {

    @Test
    void isAnagram() {
        //test = new App();
        assertTrue( App.isAnagram("star", "rats") );
        assertFalse( App.isAnagram("tacocat", "tacaocat") );

    }
}