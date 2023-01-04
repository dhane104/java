import javax.swing.*;

import org.xml.sax.ext.Locator2;



public class javaapplication {

    public static void main(String[] args) {
        JFrame frame = new JFrame("my app");
        JLabel l = new JLabel("name");
        JLabel l2 =new JLabel("adress");
        JLabel l3 =new JLabel("age");
        JLabel l4 =new JLabel("password");
        JTextField tf = new JTextField("enter your name");
        JTextField tf2 = new JTextField("enter your adress");
        JTextField tf3 = new JTextField("enter your age");

        JPasswordField pw =new JPasswordField("password");
        JTextArea ta = new JTextArea("we won't share your personal information");
        JCheckBox cb1 =new JCheckBox("male",true);
        JCheckBox cb2 =new JCheckBox("female");
        JRadioButton rb =new JRadioButton("bca");
        JRadioButton rb2 =new JRadioButton("bba");
        JRadioButton rb3 =new JRadioButton("bbm");
        JRadioButton rb4 =new JRadioButton("bit");
        JButton btn = new JButton("submit");
        l.setBounds(5, 100, 100, 30);
        l2.setBounds(5, 140, 100, 30);
        l3.setBounds(5, 180, 100, 30);
        tf.setBounds(100, 100, 200, 30);
        tf2.setBounds(100, 140,200, 30);
        tf3.setBounds(100, 180, 200, 30);
        pw.setBounds(100, 215, 400, 30);
        cb1.setBounds(100, 255, 100, 30);
        cb2.setBounds(210, 255, 100, 30);
        rb.setBounds(510, 355, 500, 90);
        rb2.setBounds(510, 355, 500, 90);
        rb3.setBounds(510, 355, 500, 80);
        rb4.setBounds(510, 355, 400, 80);
        ta.setBounds(100, 295, 200, 60);
        btn.setBounds(5, 400, 100, 30);
        frame.add(l);
        frame.add(l2);
        frame.add(l3);
        frame.add(tf);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(pw);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(rb);
        frame.add(rb2);
        frame.add(rb3);
        frame.add(rb4);
        frame.add(ta);
        frame.add(btn);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

    

