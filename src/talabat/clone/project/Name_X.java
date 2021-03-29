/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabat.clone.project;



//import talabat.clone.LogIn_Owner.SignInMouseLesiner;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


/**
 *
 * @author Aya
 */
public class Name_X extends Design {
    
   
    JTextField UserName=new JTextField();
    JLabel l1 =new JLabel ("Username: ");
    JLabel l2=new JLabel ("Password: ");
    JPasswordField Password=new JPasswordField();
   
    public Name_X()
    {
          Color col = new Color(255,90,0);
        l1.setBounds(50, 300, 100, 25);
        background.add(l1);
        UserName.setBounds(210, 300, 180, 25);
        background.add(UserName);
        l2.setBounds(50, 350, 100, 25);
        background.add(l2);
        Password.setBounds(210, 350, 180, 25);
        background.add(Password);
        
        l1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l1.setForeground(col);
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBackground(Color.white);
        l1.setForeground(new java.awt.Color(255, 153, 0));
        
        UserName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UserName.setForeground(col);
        UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserName.setBackground(Color.white);
        UserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
       
        
        l2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l2.setForeground(col);
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setBackground(Color.white);
        l2.setForeground(new java.awt.Color(255, 153, 0));
        
        Password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Password.setForeground(col);
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setBackground(Color.white);
        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        
        
    }

}
