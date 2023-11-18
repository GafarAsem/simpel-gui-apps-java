package com.gui.apps;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Grade extends JFrame {
    private JButton jButton1;//زر
    private JButton jButton2;//زر
    private JLabel jLabel1;//النص
    private JLabel jLabel2;//نص
    private JTextField num1;//رقم
    private JTextField num2;//رقم

    public Grade() {
        this.initComponents();
    }

    private void initComponents() {
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.num1 = new JTextField();
        this.num2 = new JTextField();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();

        //this.setDefaultCloseOperation(3);

        this.setTitle("Convert grades");

        this.jButton1.setText("Exit");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent var1) {
                Grade.this.jButton1ActionPerformed(var1);
            }
        });
        this.jButton2.setText("Convert");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent var1) {
                Grade.this.jButton2ActionPerformed(var1);
            }
        });
        this.num2.setEditable(false);
        this.num2.setBackground(new Color(219, 219, 219));
        this.num2.setForeground(new Color(50, 50, 50));
        this.num2.setCaretColor(new Color(109, 109, 109));
        this.jLabel1.setText("Nembers grades :");
        this.jLabel2.setText("Letters grade :");
        GroupLayout var1 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(var1);
        var1.setHorizontalGroup(var1.createParallelGroup(Alignment.LEADING).addGroup(var1.createSequentialGroup().addGap(63, 63, 63).addGroup(var1.createParallelGroup(Alignment.LEADING).addGroup(var1.createSequentialGroup().addGroup(var1.createParallelGroup(Alignment.LEADING).addGroup(var1.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel2, -2, 85, -2)).addComponent(this.jLabel1, Alignment.TRAILING, -2, 103, -2)).addGap(20, 20, 20)).addGroup(Alignment.TRAILING, var1.createSequentialGroup().addComponent(this.jButton2).addGap(42, 42, 42))).addGroup(var1.createParallelGroup(Alignment.LEADING, false).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.num1).addComponent(this.num2, -2, 51, -2)).addContainerGap(78, 32767)));
        var1.setVerticalGroup(var1.createParallelGroup(Alignment.LEADING).addGroup(var1.createSequentialGroup().addGap(79, 79, 79).addGroup(var1.createParallelGroup(Alignment.BASELINE).addComponent(this.num1, -2, -1, -2).addComponent(this.jLabel1)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(var1.createParallelGroup(Alignment.BASELINE).addComponent(this.num2, -2, -1, -2).addComponent(this.jLabel2)).addGap(27, 27, 27).addGroup(var1.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton2).addComponent(this.jButton1)).addContainerGap(67, 32767)));
        this.pack();
    }

    private void jButton2ActionPerformed(ActionEvent var1) {
        try {
            int var2 = Integer.parseInt(this.num1.getText());
            if (var2 >= 88 && var2 <= 100) {
                this.num2.setText("A");
            } else if (var2 >= 80 && var2 <= 87) {
                this.num2.setText("B");
            } else if (var2 >= 67 && var2 <= 79) {
                this.num2.setText("C");
            } else if (var2 >= 60 && var2 <= 67) {
                this.num2.setText("D");
            } else if (var2 <= 60) {
                this.num2.setText("F");
            } else {
                this.num2.setText("ERROR");
            }
        }catch (Exception e) {
            this.num2.setText("ERROR");
        }
    }

    private void jButton1ActionPerformed(ActionEvent var1) {
        System.exit(0);
    }

    public static void main(String[] var0) {

        Grade grade=new Grade();
        grade.setVisible(true);
    }
}