// Simple implementation of GUI

// import javax.swing.*;

// class LoginS{
//     public static void main(String[] args){
//         JFrame j1 = new JFrame("Welcome Batman");
//         j1.setSize(500,500);
//         j1.setVisible(true);
//         j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }


// Let make a frame from the Child of the JFrame

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class LoginS extends JFrame{

    // This are the labels that we have created ousiode so that it can accessed by anyone

    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;

    LoginS(String s1){
        // Constructor
        super(s1);  //It will go the above class that is JFRAME( Rememder JFRAME is a Predifined class in java for GUI)
    }

    LoginS(){
        // If nothing is passed top the constructor
    }
    void setComponents(){


        // the  labels that we have created inside the setComponents cannot be accessed outside so we have to create the labels outside of the setComponents function

        // JLabel li =new JLabel("WELCOME");  //this is used to create labels inside the frame
        // JTextField t1=new JTextField();   //thi is used to add a text box where we can enter input from our keyboard
        // setLayout(null);
        // li.setBounds(200,100,100,30);     //this is used to set the it location in x and y axis for labels
        // t1.setBounds(200,200,100,30);     //this is used to set the it location in x and y axis for text box
        // add(t1);  // this is to add the created labels and box inside the frame
        // add(li);

      Cursor c1 = new Cursor(Cursor.HAND_CURSOR);    //It is in awt package
      
      Font f1 =new Font("Times New Roman",Font.BOLD,28);
      Font f2=new Font("Callibri",Font.ITALIC,22);


        l1=new JLabel("Welcome to Avinash Batman Area");
        l1.setFont(f1);
        l1.setForeground(Color.GREEN);
        l2=new JLabel("Username");
        l3=new JLabel("Password");
        l3.setFont(f2);
        l3.setForeground(Color.RED);
        l4=new JLabel();
        t1=new JTextField();
        t2=new JPasswordField();
        b1=new JButton("Login");
        b1.setCursor(c1);
        b2=new JButton("Clear");
        b2.setCursor(c1);
        b3=new JButton("Add");
      


        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l1.setBounds(100,50,600,30);
        l2.setBounds(100,200,100,30);
        l3.setBounds(100,350,400,30);
        l4.setBounds(100,550,200,30);
        t1.setBounds(350,200,400,30);
        t2.setBounds(350,350,200,30);
        b1.setBounds(200,450,300,30);
        b2.setBounds(400,450,300,30);
        b3.setBounds(500,550,100,30);
        // Action parts 
        b1.addActionListener(new Log());   //Action listener can only received actionListener type of Data but action listener is a interface so it object cannot be created but the object of its child can be created and passed to the actionlistener
       
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        l1.addMouseListener(new MouseL());

        
        
    }

    class MouseL implements MouseListener{
         @Override
    public void mouseEntered(MouseEvent e1) {
        l1.setForeground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e1) {
        l1.setForeground(Color.GREEN);
    }

    @Override
    public void mouseReleased(MouseEvent e1) {
        l1.setText("Username");
    }

    @Override
    public void mouseClicked(MouseEvent e1) {
        // Handle click event
    }

    @Override
    public void mousePressed(MouseEvent e1) {
        l1.setText("");
    }

     }


    public static void main(String[] args){
       LoginS s1 =new LoginS("HI BATMAN AVINASH");

    //    Lets create the components
       s1.setVisible(true);
       s1.setSize(600,600);
       s1.setComponents();
       s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }

    class Log implements ActionListener{
        public void actionPerformed(ActionEvent e1){
           String s1= t1.getText();
           String s2= t2.getText();
           if(s1.equals("Batman")&& s2.equals("Avinash")){
            l4.setText("Login Successful");
           }
        //    else{
        //      l4.setText("Login Unsuccessful");
        //    }
           else{
            JOptionPane.showMessageDialog(null,"Login Unsuccessfull");   //with this it will pop up a message where it is implmented
           }

        }
    }


    class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
          t1.setText("");
          t2.setText("");

        }
    }

    class Add implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            try{
            int a = Integer.parseInt(t1.getText());    //Wrapper class is used here
            int b = Integer.parseInt(t2.getText());    //Wrapper class is used here
            int c=a+b;
            l4.setText("Addition is "+c);
            }
            catch(Exception e2)
            {
             System.out.println("Plese Enter Number only");
            }
            
        }
    }
}