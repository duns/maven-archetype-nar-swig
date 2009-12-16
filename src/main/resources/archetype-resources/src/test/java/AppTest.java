package ${groupId};

import junit.framework.Assert;
import junit.framework.TestCase;
import ${groupId}.App;
import ${groupId}.NarSystem;

public class AppTest extends TestCase {

    public void testApp() throws Exception {
        NarSystem.loadLibrary();

        // Call our gcd() function
    
        int x = 42;
        int y = 105;
        int g = App.gcd(x,y);
        Assert.assertEquals(21, g);
    
        // Manipulate the Foo global variable
    
        // Output its current value
        Assert.assertEquals(3.0, App.getFoo(), 0.0001);
    
        // Change its value
        App.setFoo(3.1415926);
    
        // See if the change took effect
        Assert.assertEquals(3.1415926, App.getFoo(), 0.0001);
    }
}
