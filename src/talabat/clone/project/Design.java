package talabat.clone.project;


import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Design extends JFrame {
    
     JLabel l3 =new JLabel ("talabat");
     JPanel background =new JPanel();
     JPanel background1 =new JPanel();
    
     
     
     public Design()
     {
         Color col = new Color(255,90,0);
         this.setTitle("Talabat Clone");
        this.setSize(450,780);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setLocation(450, 10);
        this.setLocation(550,150); 
        //this.setLayout(null);
        this.setResizable(false);
        background.setLayout(null);
        seticon();
        
        background1.add(l3);
        background1.setBounds(-170, 0, 780, 250);
        background.add(background1);
        
         background.setBackground(Color.white);
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        
        l3.setFont(new java.awt.Font("Gadugi", 1, 60)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setBackground(new java.awt.Color(255, 153, 0));
        l3.setForeground(Color.white);
        //l3.setText("Talabat");
       
        background1.setForeground(new java.awt.Color(255, 255, 255));
        background1.setBackground(col);
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

      
        
      this.add(background);
      
        
        
     }
     
     private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Talabat.png")));
    }
}
