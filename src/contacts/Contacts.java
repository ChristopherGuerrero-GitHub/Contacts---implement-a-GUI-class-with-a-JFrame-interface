package contacts;
import javax.swing.JFrame;

/**
 *
 * @author Christopher
 */
public class Contacts {

    public static void main(String[] args) {
        
        /*
            This program creates a ContactUI class object using a JFrame interface
            and accepts input from user in text boxes and closes the GUI when 
            user clicks the Done button.
        */
        JFrame frame = new ContactUI();
        frame.setTitle("GUI interface test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
