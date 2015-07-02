package creational.proxy;

/**
 * Created by nvans on 02.07.2015.
 *
 * @author Ivan Konovalov
 */
public class Image implements Displayable {

    /**
     * File name field
     */
    private String fileName;

    /**
     * Constructor
     * @param fileName
     */
    public Image(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }


    /**
     * File loading
     * @param fileName
     */
    private void loadFile(String fileName) {
        System.out.println("Loading " + fileName);
    }


    /**
     * Displayable interface implementation
     */
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
