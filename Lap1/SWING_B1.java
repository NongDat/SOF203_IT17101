/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Admin
 */
public class SWING_B1 {
    JFrame mainFrame;
    JLabel headerLabel;
    JLabel statucLabel;
    JPanel controlPanel;

    public SWING_B1() {
        mainFrame = new JFrame("Bai 1");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        headerLabel = new JLabel(" ",JLabel.CENTER);
        statucLabel = new JLabel(" ",JLabel.CENTER);
       // statucLabel.setSize(350, 100);
        mainFrame.setSize(400,200);
        mainFrame.setLayout(new GridLayout(3, 1));
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statucLabel);
        
        headerLabel.setText("Control in action: CheckBox");
        statucLabel.setText("...CheckBox: checked?unchecked?");
        JCheckBox chkApple = new JCheckBox("Apple");
        JCheckBox chkMango = new JCheckBox("Mango");
        JCheckBox chkPeer = new JCheckBox("Peer");
        controlPanel.add(chkApple);
        controlPanel.add(chkMango);
        controlPanel.add(chkPeer);
        chkApple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statucLabel.setText("Apple checkbox: checked");
            }
        });
        chkMango.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statucLabel.setText("Mango checkbox: checked" );
            }
        });
        chkPeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statucLabel.setText("Peer checkbox: checked" );
            }
        });
        mainFrame.setVisible(true);
    }
    
}
