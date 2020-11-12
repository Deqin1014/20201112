import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowAdapter;
public class MainFrame extends JFrame{
    private Container cp;
    private JTextField jtfR = new JTextField("0");
    private JTextField jtfG = new JTextField("0");
    private JTextField jtfB = new JTextField("0");
    private JButton jbtn = new JButton("Run");
    private JPanel jpn = new JPanel(new GridLayout(1,4,3,3));
    private JLabel jlb = new JLabel();
    public MainFrame(){
        init();
    }
    private void init(){
        this.setTitle("20201112");
        this.setBounds(150,150,400,300);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(jpn,BorderLayout.NORTH);
        jpn.add(jtfR); 
        jpn.add(jtfG); 
        jpn.add(jtfB);
        jpn.add(jbtn);
        cp.add(jlb);
        jlb.setOpaque(true);
        jbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int r = Integer.parseInt(jtfR.getText());
                int g = Integer.parseInt(jtfG.getText());
                int b = Integer.parseInt(jtfB.getText());
                jlb.setBackground(new Color(r,g,b));
            }
        });
    }
}
