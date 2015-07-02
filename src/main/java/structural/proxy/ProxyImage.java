package structural.proxy;

/**
 *
 * Virtual proxies pattern
 *
 * @author Ivan Konovalov
 */
public class ProxyImage implements Displayable {

    /**
     * Link to the real object
     */
    private Image image;

    /**
     * File name
     */
    private String fileName;

    /**
     * Constructor
     * @param fileName
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Getter for real object
     * @return
     */
    public Image getImage() {
        return image;
    }

    /**
     * Displayable interface implementation
     */
    @Override
    public void display() {
        // The real object lazy initialization
        if (image == null) {
            image = new Image(fileName);
        }
        // Call the real object method
        // after initialization
        image.display();
    }
}
