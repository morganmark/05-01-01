import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        init();
    }
    private JLabel jlb1=new JLabel("F");
    private JTextField jtf=new JTextField();
    private JButton jbn=new JButton("=");
    private JLabel jlb2=new JLabel("C");
    private JLabel jlbc=new JLabel();

    private void init(){
        this.setBounds(0,0,1000,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new GridLayout(1,5));

        this.add(jlb1);
        jlb1.setBounds(0,0,200,200);

        this.add(jtf);
        jtf.setBounds(0,200,200,200);

        this.add(jbn);
        jbn.setBounds(0,400,200,200);
        jbn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double f=Double.parseDouble(jtf.getText());
                double c=(f-32)*5/9;
                jlbc.setText(String.valueOf(c));
            }
        });

        this.add(jlb2);
        jlb2.setBounds(0,600,200,200);

        this.add(jlbc);
        jlbc.setBounds(0,800,200,200);
    }
}
