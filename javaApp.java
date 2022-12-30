import javax.swing.*;


public class javaApp {
public static void main(String[] args) {
    JFrame frame = new JFrame("this is my java app");

    
    JPanel p =new JPanel();
    ImageIcon icon = new ImageIcon("C:/Users/DELL/OneDrive/Pictures/images.jpg");
    JLabel lbl = new JLabel(icon);
    ImageIcon appicon = new ImageIcon("C:/Users/DELL/OneDrive/Pictures/images.jpg");
    frame.setIconImage(appicon.getImage());
    //frame.add(lbl);
    p.add(lbl);
    // JLabel lbl = new JLabel("hello bca");
    lbl.setText("hello bca");
    frame.add(p);

   
    frame.setSize(600,300);
    frame.setVisible(true);
    
}
}