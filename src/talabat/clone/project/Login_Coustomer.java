/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone.project;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Aya
 */
public class Login_Coustomer extends Name_X{
    
    JLabel l4 =new JLabel ("Mobile Number: ");
    JLabel l5=new JLabel ("Address: ");
    JTextField MobileNumber=new JTextField();
    JTextField Address=new JTextField();
    JButton SIGNIN=new JButton("SIGNIN");
    JButton Register=new JButton("Register");
    JButton Forget=new JButton("Forget Password");
    SignInMouseLesiner signMouse=new SignInMouseLesiner();
    RegisterMouse registerMouse=new RegisterMouse();
    ForgetMouse forgetMouse =new ForgetMouse();
    
    public Login_Coustomer()
    {
        Color col = new Color(255, 90,0);
        l4.setBounds(20, 400, 180, 25);
        background.add(l4);
        MobileNumber.setBounds(210, 400, 180, 25);
        background.add(MobileNumber);
        l5.setBounds(50, 450, 100, 25);
        background.add(l5);
        Address.setBounds(210, 450, 180, 25);
        background.add(Address);
        
        
         l4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l4.setForeground(col);
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setBackground(Color.white);
        
        MobileNumber.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        MobileNumber.setForeground(new java.awt.Color(255, 153, 0));
        MobileNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MobileNumber.setBackground(Color.white);
        MobileNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        
        l5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l5.setForeground(col);
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setBackground(Color.white);
  
        Address.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 153, 0));
        Address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Address.setBackground(Color.white);
        Address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        
         SIGNIN.setBounds(50, 515, 140, 32);
        background.add(SIGNIN);
        Register.setBounds(250, 515, 140, 32);
        background.add(Register);
        Forget.setBounds(100, 580, 245, 32);
        background.add(Forget);
        
        
        SIGNIN.setBackground(col);
        SIGNIN.setForeground(Color.white);
        SIGNIN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        SIGNIN.setFont(new java.awt.Font("Calibri", 0, 18));
        SIGNIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SIGNIN.addMouseListener(signMouse);
        
        Register.setBackground(col);
        Register.setForeground(Color.white);
        Register.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        Register.setFont(new java.awt.Font("Calibri", 0, 18));
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(registerMouse);
        
        Forget.setBackground(col);
        Forget.setForeground(Color.white);
        Forget.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        Forget.setFont(new java.awt.Font("Calibri", 0, 18));
        Forget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Forget.addMouseListener(forgetMouse);
        
        String Mobilenumber=MobileNumber.getText();
        int mobileNumber=MobileNumber.getText().length();
        String address=Address.getText();

       
    }
    

 public class SignInMouseLesiner implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) 
        {
            createRestaurant create=new createRestaurant();
            String username=UserName.getText();
            String password=Password.getPassword().toString();
            int pass=Password.getPassword().length;
            String Mobilenumber=MobileNumber.getText();
            int mobileNumber=MobileNumber.getText().length();
            String address=Address.getText();

            if (username.isEmpty()||password.isEmpty()||Mobilenumber.isEmpty()||address.isEmpty())
            {
                JOptionPane.showConfirmDialog(null,"You must fill all fields completely","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if (pass<6)
            {
                JOptionPane.showConfirmDialog(null,"Password must be greater than 6","Error",JOptionPane.ERROR_MESSAGE);
            }else if (!(mobileNumber==11))
            {
                JOptionPane.showConfirmDialog(null,"Mobile Number must contain 11 numbers","Error",JOptionPane.ERROR_MESSAGE);
            }else if (!Pattern.matches("[a-zA-Z]+", username))
            {
                 JOptionPane.showConfirmDialog(null,"Tha name is Invalid","Error",JOptionPane.ERROR_MESSAGE);
                 UserName.setText("");
            }
            else if(!Pattern.matches("^[0-9]+$", Mobilenumber))
            {

                JOptionPane.showConfirmDialog(null,"Mobile Number must contain numbers only","Error",JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                 restaurants_page x=new restaurants_page();
           //   PageRestaurant x=new PageRestaurant(1);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
            
        
            SIGNIN.setForeground(new Color(255,153,0));
            SIGNIN.setBackground(Color.white);
            SIGNIN.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
            

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==SIGNIN)
            {
            SIGNIN.setForeground(new Color(255,153,0));
            SIGNIN.setBackground(Color.white);
            SIGNIN.setBorder(new LineBorder(new Color(255,153,0),1,true));
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==SIGNIN)
            {
            SIGNIN.setForeground(new Color(255,153,0));
            SIGNIN.setBackground(Color.white);
            SIGNIN.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==SIGNIN)
            {
            SIGNIN.setForeground(new Color(255,153,0));
            SIGNIN.setBackground(Color.white);
            SIGNIN.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }

        @Override
        public void mouseExited(MouseEvent e) {
             if(e.getSource()==SIGNIN)
            {
            SIGNIN.setBackground(new Color(255,153,0));
            SIGNIN.setForeground(Color.white);
            SIGNIN.setBorder(new LineBorder(new Color(255,153,0),1,true));
            }
        }
        }

       
          
      
     
      public class RegisterMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(new Color(255,153,0));
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
            LogIn_Owner2 x=new LogIn_Owner2();
            dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(new Color(255,153,0));
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(new Color(255,153,0));
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setForeground(new Color(255,153,0));
            Register.setBackground(Color.white);
            Register.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Register)
            {
            Register.setBackground(new Color(255,153,0));
            Register.setForeground(Color.white);
            Register.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }
        
      }
      
       public class ForgetMouse implements MouseListener 
      {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(new Color(255,153,0));
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(new Color(255,153,0),1,true));
            ForgetPassword2 x=new ForgetPassword2();
            dispose();
        }
            //LogIn_Owner x=new LogIn_Owner();
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(new Color(255,153,0));
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(new Color(255,153,0),1,true));
            }   
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(new Color(255,153,0));
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(new Color(255,153,0),1,true));
            }
          
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            if(e.getSource()==Forget)
            {
            Forget.setForeground(new Color(255,153,0));
            Forget.setBackground(Color.white);
            Forget.setBorder(new LineBorder(new Color(255,153,0),1,true));
            }
        }
        @Override
        public void mouseExited(MouseEvent e)
        {
            if(e.getSource()==Forget)
            {
            Forget.setBackground(new Color(255,153,0));
            Forget.setForeground(Color.white);
            Forget.setBorder(new LineBorder(new Color(255,153,0),1,true));
            }
        }
    }
}

        
    
    

