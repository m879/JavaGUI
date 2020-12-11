package com.meraj;
import javax.swing.*;          //Import to swing library
import java.awt.*;
import java.awt.event.*;          //Import for event in GUI
import java.io.BufferedWriter;   //Import to write text file
import java.io.File;              //Import to write text file
import java.io.FileWriter;          //Import to write text file

public class Main {
    Main(){

        JFrame f= new JFrame();            //Frame created for GUI

        JLabel label=new JLabel("WELCOME TO EXAMINATION DASHBOARD");   //Creating label
        label.setBounds(250,-10, 300,100);            //Position ans size of label
        label.setForeground(new Color(255,0,0));


        JLabel label1=new JLabel("Enter name:");            //Creating label
        label1.setBounds(50,30, 300,100);           //Position ans size of label
        label1.setForeground(new Color(255,255,255));         //Color of label
        JLabel label2=new JLabel("Enter faculty number:");
        label2.setBounds(50,80, 300,100);
        label2.setForeground(new Color(255,255,255));


        final JTextField tf=new JTextField();               //Creating textfield
        tf.setBounds(350,60, 150,30);    //Position and size of textfied
        final JTextField tf2=new JTextField();               //Creating textfield
        tf2.setBounds(350,110, 150,30);    //Position and size of textfied

        JButton btn1=new JButton("Save about me");      //Creating button
        btn1.setBounds(230,180,200,30);    //Position of button
        btn1.setBackground(new Color(0,255,0));      //Background color of button

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
                String name=tf.getText();                 //Get text from input field
                String facultyno=tf2.getText();             //Get text from input field
                System.out.println(name);                   //print text from input field
                System.out.println(facultyno);               //print text from input field
            }
        });


        JPanel p0=new JPanel();       //Creating panel for switch between different screen

        JLabel ins=new JLabel("Please enter your name and faculty number.");   //Label created
        p0.add(ins);                                                               //Label added to first panel
        JLabel ins1=new JLabel("These app contain two types of questions");
        p0.add(ins1);
        JLabel ins2=new JLabel("Objective will be calculated after completing but subjective will save " +
                "as text file for evaluation.");
        p0.add(ins2);


        JPanel p1=new JPanel();          //Second panel created

        JLabel label3=new JLabel("Cannot use as backend?");       //Label created
        p1.add(label3);                                            //Label added to second panel
        JRadioButton r1=new JRadioButton("A) Sass");           //Radio button created
        JRadioButton r2=new JRadioButton("B) Nodejs");
        JRadioButton r3=new JRadioButton("C) PHP");
        JRadioButton r4=new JRadioButton("D) Django");
        ButtonGroup bg=new ButtonGroup();                       //Grouping radio button in single button
        bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);         //All button added to single button
        p1.add(r1);p1.add(r2);p1.add(r3);p1.add(r4);        //Radio button added to second panel
        JButton sub1=new JButton("Submit");            //Button created
        sub1.setBounds(10,110,100,30);
        sub1.setBackground(new Color(255,0,0));
        p1.add(sub1);                   //Button added to panel 2

        sub1.addActionListener(new ActionListener(){             //Action performed on clicking sub1 btn
            public void actionPerformed(ActionEvent e){
                if(r4.isSelected() || r3.isSelected() || r2.isSelected()){
                    JOptionPane.showMessageDialog(f,"Your answer is wrong.");
                }
                if(r1.isSelected()){
                    JOptionPane.showMessageDialog(f,"Your answer is correct.");
                }
            }
        });


        JLabel label4=new JLabel("GUI library for python?");
        p1.add(label4);
        JRadioButton b1=new JRadioButton("A) Pyttxs3");
        JRadioButton b2=new JRadioButton("B) Numpy");
        JRadioButton b3=new JRadioButton("C) Tkinter");
        JRadioButton b4=new JRadioButton("D) Pandas");
        ButtonGroup bg2=new ButtonGroup();
        bg2.add(b1);bg2.add(b2);bg2.add(b3);bg2.add(b4);
        p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);
        JButton sub2=new JButton("Submit");
        sub2.setBounds(10,110,100,30);
        sub2.setBackground(new Color(255,0,0));
        p1.add(sub2);

        sub2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(b1.isSelected() || b4.isSelected() || b2.isSelected()){
                    JOptionPane.showMessageDialog(f,"Your answer is wrong.");
                }
                if(b3.isSelected()){
                    JOptionPane.showMessageDialog(f,"Your answer is correct.");
                }
            }
        });


        JLabel label5=new JLabel("Which is realtime database?");
        p1.add(label5);
        JRadioButton c1=new JRadioButton("A) MYSQL");
        JRadioButton c2=new JRadioButton("B) Mongodb");
        JRadioButton c3=new JRadioButton("C) SQL");
        JRadioButton c4=new JRadioButton("D) Firebase");
        ButtonGroup bg3=new ButtonGroup();
        bg3.add(c1);bg3.add(c2);bg3.add(c3);bg3.add(c4);
        p1.add(c1);p1.add(c2);p1.add(c3);p1.add(c4);
        JButton sub3=new JButton("Submit");
        sub3.setBounds(10,110,100,30);
        sub3.setBackground(new Color(255,0,0));
        p1.add(sub3);

        sub3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(c1.isSelected() || c3.isSelected() || c2.isSelected()){
                    JOptionPane.showMessageDialog(f,"Your answer is wrong.");
                }
                if(c4.isSelected()){
                    JOptionPane.showMessageDialog(f,"Your answer is correct.");
                }
            }
        });



        JPanel p2=new JPanel();
        JLabel label6=new JLabel("Explain how to use firebase in ReactJs?");
        p2.add(label6);
        JTextArea textArea = new JTextArea(3, 50);
        p2.add(textArea);

        JLabel label7=new JLabel("How to use Django with reactJs?");
        p2.add(label7);
        JTextArea textArea1 = new JTextArea(3, 50);
        p2.add(textArea1);

        JButton finish2=new JButton("Submit");
        finish2.setBounds(10,110,100,30);
        finish2.setBackground(new Color(0,0,255));
        finish2.setForeground(new Color(255,255,255));
        p2.add(finish2);

        finish2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String ans1=textArea.getText();
                String ans2=textArea1.getText();

                System.out.println(ans1);
                System.out.println(ans2);
                File fi = new File("answer.txt");
                try {
                    // Create a file writer
                    FileWriter wr = new FileWriter(fi, false);
                    // Create buffered writer to write
                    BufferedWriter w = new BufferedWriter(wr);
                    // Write
                    w.write("Answer 1: " +ans1);
                    w.write("\nAnswer 2 : "+ans2);
                    w.flush();
                    w.close();
                    JOptionPane.showMessageDialog(f,"Your answer created as text file.","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                catch (Exception evt) {
                        JOptionPane.showMessageDialog(f, evt.getMessage());
                }
            }
        });



        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(0,250,600,250);
        tp.add("Instructions",p0);
        tp.add("Objective",p1);
        tp.add("Subjective",p2);

         //Component added to frame
        f.add(tp);
        f.add(label);
        f.add(label1);
        f.add(label2);
        f.add(tf);
        f.add(tf2);
        f.add(btn1);
        f.setSize(700,600);
        f.setLayout(null);            //Layout block for frame
        f.setVisible(true);           //For visibility  of frame
        f.setResizable(false);                //To prevent resizable of frame
        f.getContentPane().setBackground(new Color(0,0,255));   //Change background color of frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //Used to exit on clicking cross btn

    }


    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
