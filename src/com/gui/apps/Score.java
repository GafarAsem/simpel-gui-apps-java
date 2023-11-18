package com.gui.apps;


import javax.swing.*;

public class Score extends JFrame {

    JButton buttonEnter,buttonReset,buttonExit;
    JLabel labelTest,labelNumber,labelAverage,labelBest;
    JTextField textFieldTest,textFieldNumber,textFieldAverage,textFieldBest;

    int numberScore,bestScore;
    double averageScore;

    public Score() {
        numberScore=0;
        bestScore=0;
        averageScore=0;

        buttonEnter=new JButton("Enter Score");
        buttonReset=new JButton("Reset");
        buttonExit=new JButton("Exit");

        labelAverage=new JLabel("Average Score:");
        labelBest=new JLabel("Best Score:");
        labelNumber=new JLabel("Number of Score:");
        labelTest=new JLabel("Test Score");
        textFieldTest=new JTextField();
        textFieldNumber=new JTextField();
        textFieldAverage=new JTextField();
        textFieldBest=new JTextField();

        textFieldNumber.setEditable(false);
        textFieldAverage.setEditable(false);
        textFieldBest.setEditable(false);

        buttonExit.addActionListener(e -> {
            System.exit(0);
        });

        buttonEnter.addActionListener(e -> {
            try {
                int thisScore = Integer.parseInt(textFieldTest.getText());

                if (thisScore <= 100) {
                    textFieldNumber.setText(String.valueOf(++numberScore));

                    averageScore = (averageScore + thisScore) / numberScore;
                    textFieldAverage.setText(String.valueOf(averageScore));

                    if (bestScore < thisScore)
                        bestScore = thisScore;

                    textFieldBest.setText(String.valueOf(bestScore));
                    textFieldTest.setText("");
                } else textFieldTest.setText("error");

            }catch (Exception exception){
                textFieldTest.setText("error");
            }

        });

        buttonReset.addActionListener(e -> {
            numberScore=0;
            bestScore=0;
            averageScore=0;

            textFieldNumber.setText("");
            textFieldBest.setText("");
            textFieldAverage.setText("");
            textFieldTest.setText("");
        });

        labelTest.setBounds(20,50,150,20);
        labelNumber.setBounds(20,100,150,20);
        labelAverage.setBounds(20,150,150,20);
        labelBest.setBounds(20,200,150,20);

        textFieldTest.setBounds(150,50,170,20);
        textFieldNumber.setBounds(150,100,170,20);
        textFieldAverage.setBounds(150,150,170,20);
        textFieldBest.setBounds(150,200,170,20);

        buttonEnter.setBounds(20,250,120,20);
        buttonReset.setBounds(150,250,120,20);
        buttonExit.setBounds(280,250,120,20);

        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setSize(500,400);
        panel.add(labelTest);
        panel.add(textFieldTest);
        panel.add(labelNumber);
        panel.add(textFieldNumber);
        panel.add(labelAverage);
        panel.add(textFieldAverage);
        panel.add(labelBest);
        panel.add(textFieldBest);


        panel.add(buttonEnter);
        panel.add(buttonReset);
        panel.add(buttonExit);

        this.add(panel);


    }

    public static void main(String[] args) {
        Score score=new Score();
        score.setSize(450,350);
        score.setLayout(null);
        score.setVisible(true);
        score.setTitle("Test scores");
    }
}
