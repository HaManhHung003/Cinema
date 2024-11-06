package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import component.Combobox1;
import javax.swing.JPanel;
import component.Combobox;
import javax.swing.JButton;

public class Test extends JFrame {
	public Test() {
		setSize(1425,820);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(72, 209, 204));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(74, 132, 218, 35);
		getContentPane().add(panel);
		panel.setLayout(null);
		Combobox1 cb = new Combobox1();
		cb.setBounds(10, 0, 209, 35);
		panel.add(cb);
		cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
		cb.setSelectedIndex(-1);
		
		Combobox cb1 = new Combobox();
		cb1.setBounds(10, 20, 209, 35);
		getContentPane().add(cb1);
		cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
		cb1.setSelectedIndex(-1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(402, 58, 255, 67);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
          
            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){
            	String a = cb.getSelectedItem().toString();
        		System.out.println(a);
        		cb.setSelectedItem("Item3");
            }
          
        });
		
	}
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		Test tst = new Test();
		tst.setVisible(true);
	}
}
