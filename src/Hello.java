import sun.net.www.http.HttpClient;

import javax.swing.*;
import java.awt.event.*;


public class Hello extends JDialog {
    //String kota;
    static String codeNegara = "id", kota = "Medan";
    private static String url;
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;

    public Hello() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });


        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public static void main(String[] args) {
        // Create an instance of HttpClient.
       //HttpClient client = new HttpClient();
       Hello dialog = new Hello();

        dialog.pack();
        dialog.setVisible(true);

       System.exit(0);
    }

    private void onOK() {
         //add your code here
        //dispose();
        kota = textField1.getText().toString();
        String hasil = "Cuaca di kota "+kota+" saat ini ..";
        JOptionPane.showConfirmDialog(null, hasil, "My custom dialog", JOptionPane.PLAIN_MESSAGE);

    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

}
