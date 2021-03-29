/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone.project;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Aya
 */
public class Person3 extends Design {
    
   
    JButton Owner=new JButton("1. Owner");
    JButton Customer=new JButton("2. Customer");
    JButton EXIT=new JButton("E X I T");
    JLabel l2 =new JLabel (" Who are you ? ");
    MouseLesiner x=new MouseLesiner();
    CustomerMouse y=new CustomerMouse();
    ExitMouse z=new ExitMouse();
    
    public Person3()
    {
        Color col = new Color(255,90,0);
        Owner.setBounds(120, 400, 180, 35);
        background.add(Owner);
        Customer.setBounds(120, 480, 180, 35);
        background.add(Customer);
        EXIT.setBounds(120, 570, 180, 35);
        background.add(EXIT);
        l2.setBounds(70, 280, 290, 70);
        background.add(l2);
        
        
        background.setBackground(Color.white);
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        
       
        l2.setForeground(Color.BLACK);
        l2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        l2.setBackground(Color.white);
        l2.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //l2.setForeground(new java.awt.Color(255, 255, 255));
        //Owner.setBackground(Color.white);
       // Customer.setBackground(Color.white);
        //EXIT.setBackground(Color.white);
        
        Owner.setBackground(col);
        Owner.setForeground(Color.white);
        Owner.setBorder(new javax.swing.border.LineBorder(col, 1, true));
        Owner.setFont(new java.awt.Font("Berlin sans fb",Font.PLAIN, 20));
        Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Owner.setFocusable(false);
        Owner.addMouseListener(x);
        
        Customer.setBackground(col);
        Customer.setForeground(Color.white);
        Customer.setBorder(new javax.swing.border.LineBorder(col, 1, true));
        Customer.setFont(new java.awt.Font("Gadugi", Font.BOLD, 20));
        Customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Customer.setFocusable(false);
        Customer.addMouseListener(y);
        
        EXIT.setBackground(col);
        EXIT.setForeground(Color.white);
        EXIT.setBorder(new javax.swing.border.LineBorder(col, 1, true));
        EXIT.setFont(new java.awt.Font("Gadugi", Font.BOLD, 22));
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.setFocusable(false);
        EXIT.addMouseListener(z);
        
        
      
    }

   
    
   
      public class MouseLesiner implements MouseListener 
      {
          Color col = new Color(255,90,0);

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(new Color(255,153,0));
            Owner.setBackground(col);
            Owner.setBorder(new LineBorder(col,1,true));
            LogIn_Owner2 x=new LogIn_Owner2();
            dispose();
        }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(new Color(255,153,0));
            Owner.setBackground(col);
            Owner.setBorder(new LineBorder(col,1,true));
        }
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(new Color(255,153,0));
            Owner.setBackground(Color.white);
            Owner.setBorder(new LineBorder(col,1,true));
        }
          
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setForeground(new Color(255,153,0));
            Owner.setBackground(Color.white);
            Owner.setBorder(new LineBorder(col,1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Owner)
            {
            Owner.setBackground(col);
            Owner.setForeground(Color.white);
            Owner.setBorder(new LineBorder(col,1,true));
        }
        }
          
      }
      
      public class CustomerMouse implements MouseListener
      {
          Color col = new Color(255,90,0);

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(new Color(255,153,0));
            Customer.setBackground(Color.white);
            Customer.setBorder(new LineBorder(new Color(255,153,0),1,true));
            Login_Coustomer x=new Login_Coustomer();
            dispose();
        }
            //Login_Coustomer x=new Login_Coustomer();
            //dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(new Color(255,153,0));
            Customer.setBackground(col);
            Customer.setBorder(new LineBorder(new Color(255,153,0),1,true));
           // Login_Coustomer x=new Login_Coustomer();
        }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(new Color(255,153,0));
            Customer.setBackground(Color.white);
            Customer.setBorder(new LineBorder(new Color(255,153,0),1,true));
            //Login_Coustomer x=new Login_Coustomer();
        }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setForeground(new Color(255,153,0));
            Customer.setBackground(Color.white);
            Customer.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==Customer)
            {
            Customer.setBackground(col);
            Customer.setForeground(Color.white);
            Customer.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
            
        }
          
      }
      
      public class ExitMouse implements MouseListener 
      {
          Color col = new Color(255,90,0);

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(new Color(255,153,0));
            EXIT.setBackground(Color.white);
            EXIT.setBorder(new LineBorder(new Color(255,153,0),1,true));
            talabat t=new talabat();
            dispose();
        }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(new Color(255,153,0));
            EXIT.setBackground(col);
            EXIT.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(new Color(255,153,0));
            EXIT.setBackground(Color.white);
            EXIT.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setForeground(new Color(255,153,0));
            EXIT.setBackground(Color.white);
            EXIT.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if(e.getSource()==EXIT)
            {
            EXIT.setBackground(col);
            EXIT.setForeground(Color.white);
            EXIT.setBorder(new LineBorder(new Color(255,153,0),1,true));
        }
        }
      }
}


