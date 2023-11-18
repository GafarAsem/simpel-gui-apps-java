package com.gui.apps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame {

    private JButton buttonCalculate;
    private JButton buttonExit;

    private JTextField textFahrenhit;
    private JTextField textCelsius;

    private JLabel labelFahenhit;
    private JLabel labelCelsius;

    public Temperature(){
      buttonCalculate=new JButton();
      buttonExit=new JButton();
      textCelsius=new JTextField();
      textFahrenhit=new JTextField();
      labelCelsius=new JLabel();
      labelFahenhit=new JLabel();

      buttonCalculate.setText("Calculate");
      buttonExit.setText("Exit");
      labelFahenhit.setText("Fahrenheit");
      labelCelsius.setText("Celsius");

      textCelsius.setEditable(false);
      this.setTitle("Calculate");

      buttonCalculate.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              int f= Integer.parseInt(textFahrenhit.getText());
              int c=(f-32)*5/9;
              textCelsius.setText(String.valueOf(c));

          }
      });
      buttonExit.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.exit(0);
          }
      });

      labelFahenhit.setBounds(20,50,150,25);
      labelCelsius.setBounds(20,100,150,25);
        textFahrenhit.setBounds(70,50,150,25);
        textCelsius.setBounds(70,100,150,25);

        JPanel panelBox=new JPanel();
        panelBox.setSize(100,100);
        panelBox.setLayout(null);
        panelBox.add(labelFahenhit); panelBox.add(textFahrenhit);
        panelBox.add(labelCelsius); panelBox.add(textCelsius);

        JPanel panelButtons=new JPanel(new FlowLayout());
        panelButtons.add(buttonCalculate);
        panelButtons.add(buttonExit);

        panelBox.setPreferredSize(new Dimension(100,100));


        this.add(panelBox);

        this.add(Box.createVerticalStrut(10));

        this.add(panelButtons);



        this.pack();
        this.setVisible(true);


    }

    public static void main(String[] args) {
        Temperature temperature=new Temperature();
        temperature.setSize(300,300);
        temperature.setLayout(new BoxLayout(temperature.getContentPane(), BoxLayout.Y_AXIS));
    }
}
