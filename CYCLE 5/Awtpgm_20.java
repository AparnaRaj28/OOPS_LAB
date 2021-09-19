import java.awt.*;
import java.awt.event.*;

class Awtpgm_20 implements ActionListener {

	Awtpgm_20() {
        Frame f = new Frame();

        Label L1 = new Label("First number");
        Label L2 = new Label("Second number");
        Label L3 = new Label("Third number");
        Label L4 = new Label("Greatest number");

        Button B1 = new Button("Submit");

        TextField T1 = new TextField();
        TextField T2 = new TextField();
        TextField T3 = new TextField();
        TextField T4 = new TextField();

        // set position and size
        L1.setBounds(50, 50, 80, 50);
        L2.setBounds(150, 50, 80, 50);
        L3.setBounds(250, 50, 80, 50);
        L4.setBounds(350, 50, 80, 50);
        T1.setBounds(50, 100, 80, 50);
        T2.setBounds(150, 100, 80, 50);
        T3.setBounds(250, 100, 80, 50);
        T4.setBounds(350, 100, 80, 50);
        B1.setBounds(150, 200, 80, 30);

        // Add components to frame
        f.add(B1);
        f.add(L1);
        f.add(L2);
        f.add(L3);
        f.add(L4);
        f.add(T1);
        f.add(T2);
        f.add(T3);
        f.add(T4);

        // Action events
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(T1.getText());
                int b = Integer.parseInt(T2.getText());
                int c = Integer.parseInt(T3.getText());
                int large=0;

                if (a >= b && a >= c) {
                    large = a;
                } else if (b >= a && b >= c) {
                    large = b;
                } else if (c >= a && c >= b) {
                    large = c;
                }

                T4.setText(Integer.toString(large));
            }
        });

        f.setSize(600, 300);
        f.setTitle("Greatest of 3 Numbers");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
    	Awtpgm_20 maxObj = new Awtpgm_20();
    }

    public void actionPerformed(ActionEvent e) {

    }

}