package creational.proxy;

import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by nvans on 02.07.2015.
 *
 * @author Ivan Konovalov
 */
public class ProxyTest {
    @Test
    public void TestProxy() {
        ProxyImage proxyImage = new ProxyImage("11.file");

        assertNull("The real object is not initialized", proxyImage.getImage());

        proxyImage.display();

        assertTrue(proxyImage.getImage() instanceof Image);
    }
}
