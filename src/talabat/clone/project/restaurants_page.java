
package talabat.clone.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;
import javafx.scene.image.ImageView;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.util.*; 
import javax.swing.*;
//import talabat.clone.Pages.*; //.mouse_Listener
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import static talabat.clone.project.createRestaurant.restaurant;

public class restaurants_page extends JFrame 
{
    public static Color darkOrange=new Color(255,51,0);
    
    JFrame frame;
    JLabel all_res;
    JLabel img[],imgst,label[];
    int res_num=createRestaurant.number_Restaurant;
    JLabel type,delivery_cost,delivery_time,status;
    JTextArea panel;
    action a;
    
    JLabel logout=new JLabel("Logout");

    public restaurants_page()
    {  
        
        frame = new JFrame ("Talabat Clone");
        setTitle("Talabat Clone");
        setSize(470,790);
        setResizable(true);
        setLocation(550,150); //900 100
        a=new action();
        
  
        JTextArea panel = new JTextArea(res_num*20+10,150);  
        panel.setEditable(false);
        panel.setLayout(null);

        JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setSize(8,8);
        add(scroll);
        //scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Font t_font = new Font("Ebrima",Font.BOLD ,36 );
        Font d_font = new Font("Berlin sans fb",Font.PLAIN,20);
        Font font = new Font("gabriola",Font.BOLD,45);
        Color col = new Color(255, 51,0);
        
        all_res = new JLabel("All restaurants");
        all_res.setFont(t_font);
        all_res.setForeground(Color.BLACK);
        all_res.setBackground(Color.white);
        all_res.setOpaque(true);
        all_res.setBounds(10,5,250,40);  
        panel.add(all_res);
        
        logout.setBounds(350, 10, 100, 40);
        logout.setForeground(Color.black);
        logout.setBackground(Color.white);
        logout.setFont(new Font("sansserif",Font.BOLD,20));
        panel.add(logout);
        logout.addMouseListener(a);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
       /*
        imgst = new JLabel();
        String style1="des2.jpg";
        imgst.setIcon(new ImageIcon(restaurants_page.class.getResource(style1)));
        imgst.setBounds(320,10,50,38);
        imgst.setBackground(Color.black);
        imgst.addMouseListener(a);
        panel.add(imgst);
        
        imgst = new JLabel();
        String style2="mob5.jpg";
        imgst.setIcon(new ImageIcon(restaurants_page.class.getResource(style2)));
        imgst.setBounds(375,8,50,40);
        imgst.setBackground(Color.white);
        imgst.addMouseListener(a);
        panel.add(imgst);
        */
        int h1=60,h2=h1+210,h3=h2+45,h4=h3+25;
        label=new JLabel[50];
        img=new JLabel[50];
        for(int i=1;i<=res_num;i++)
        {
            img[i] = new JLabel();
            java.net.URL imageUrl = restaurants_page.class.getResource(createRestaurant.restaurant[i].image_res);
            if(imageUrl != null){
            img[i].setIcon(new ImageIcon(imageUrl));
         }
            //img[i].setIcon(new ImageIcon(restaurants_page.class.getResource(createRestaurant.restaurant[i].image_res)));
            img[i].setBounds(0,h1,437,220);
            LineBorder c1=new LineBorder(Color.WHITE,10,true);
            img[i].setBorder(c1);
            panel.add(img[i]);
            img[i].addMouseListener(a);

            label[i]= new JLabel(createRestaurant.restaurant[i].name_Restautrant);
            label[i].setFont(font);
            label[i].setForeground(Color.black);
            label[i].setBounds(10,h2,270,60);
            panel.add(label[i]);

            delivery_time= new JLabel("within "+createRestaurant.restaurant[i].delivery_time+" mins");
            delivery_time.setFont(d_font);
            delivery_time.setForeground(Color.BLACK);
            delivery_time.setBounds(300,h2+15,150,30);
            panel.add(delivery_time);  

            type= new JLabel(createRestaurant.restaurant[i].res_type);
            type.setFont(d_font);
            type.setForeground(Color.GRAY);
            type.setBounds(10,h3,400,30);
            panel.add(type);

            status= new JLabel(createRestaurant.restaurant[1].rating_status);
            status.setFont(d_font);
            status.setForeground(Color.GRAY);
            status.setBounds(10,h4,200,30);
            panel.add(status);

            delivery_cost= new JLabel(", Delivery: "+createRestaurant.restaurant[1].delivery_cost );
            delivery_cost.setFont(d_font);
            delivery_cost.setForeground(Color.GRAY);
            delivery_cost.setBounds(120,h4,200,30);
            panel.add(delivery_cost);

            h1+=340;
            h2=h1+210;
            h3=h2+45;
            h4=h3+25;
            
            img[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        seticon();
        logOut();
      
    }  
    private class action implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent me) {
            
            for(int i=1;i<=res_num;i++)
            {
                if(me.getSource()==img[i] )
                {
                    PageRestaurant tes=new PageRestaurant(i);
                   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   dispose();
                }
                     
            };
            if(me.getSource()==logout)
            {
                
                Person3 o=new Person3();
                setVisible(false);
            }

            }

        @Override
        public void mousePressed(MouseEvent me) {
           
        }

        @Override
        public void mouseReleased(MouseEvent me) {
           
        }

        @Override
        public void mouseEntered(MouseEvent me) {
           if(me.getSource()==logout)
            {
                
               logout.setForeground(darkOrange);

            }
        }

        @Override
        public void mouseExited(MouseEvent me) {
           
            if(me.getSource()==logout)
            {
               
               logout.setForeground(Color.black);
            }
        } 
        
        }
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
       
    }
    
    public void logOut()
    {
        
        //Font logout = new Font("Berlin sans fb",Font.PLAIN,20);
        
        
    }

    }
    

