import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
import sun.audio.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class art extends JPanel implements KeyListener, ActionListener, MouseListener, MouseMotionListener

{
    //instance variables
   
    Image p1;
    Image cam1;
    Image cam;
    Image tv;
    Image tv1;
    Image com;
    Image com1;
    Image ph;
    Image ph1;
    Image vr;
    Image vr1;
    Image gpt;
    Image gpt1;
    Image d;
    Image d1;
    Image d2;
    Image d3;
    AudioStream Song; 
    int screen = 1;
    
    //constructor
    public art()
    {
         addMouseListener(this);
        addMouseMotionListener(this);
        
        try
        {
           p1 = ImageIO.read(new File("1.png"));
           cam = ImageIO.read(new File("cam.png"));
           cam1 = ImageIO.read(new File("cam1.png"));
           tv = ImageIO.read(new File("tv.png"));
           tv1 = ImageIO.read(new File("tv1.png"));
            com = ImageIO.read(new File("com.png"));
           com1 = ImageIO.read(new File("com1.png"));
             ph = ImageIO.read(new File("ph.png"));
           ph1 = ImageIO.read(new File("ph1.png"));
             vr = ImageIO.read(new File("vr.png"));
           vr1 = ImageIO.read(new File("vr1.png"));
             gpt = ImageIO.read(new File("gpt.png"));
           gpt1 = ImageIO.read(new File("gpt1.png"));
             d = ImageIO.read(new File("g.png"));
           d1 = ImageIO.read(new File("g1.png"));
             d2 = ImageIO.read(new File("g2.png"));
           d3 = ImageIO.read(new File("g3.png"));
           Song = new AudioStream(new FileInputStream("Song.wav"));
           
        }
        catch( IOException e)
        {
        }
    }
    
   
    public void paint(Graphics g)
    {
        if(screen == 1) // menu screen
        {
            Menu(g);
        }
        if(screen ==2) // start the game screen
        {
            cam(g);
        }
        if(screen ==3)
        {
            cam1(g);
        }
        if(screen ==4)
        tv(g);
        if(screen ==5)
        tv1(g);
        if(screen ==6)
        com(g);
        if(screen ==7)
        com1(g);
        if(screen ==8)
        ph(g);
        if(screen ==9)
        ph1(g);
        if(screen ==10)
        vr(g);
        if(screen ==11)
        vr1(g);
         if(screen ==12)
        gpt(g);
        if(screen ==13)
        gpt1(g);
         if(screen ==14)
        d(g);
        if(screen ==15)
        d1(g);
         if(screen ==16)
        d2(g);
        if(screen ==17)
        d3(g);
        
       
    }
    
    public void Menu(Graphics g) // play screen, reset ball position
    {
     
        g.drawImage(p1, 0,0, null); // background
        AudioPlayer.player.start(Song);
        
        
    }
    public void cam1(Graphics g) // play screen without instructions
    {
       
        g.drawImage(cam1, 0,0, null); // background
     
        
    }
     public void cam(Graphics g) // menu screen
    {
        g.drawImage(cam, 0,0, null);
        
    }
   
     public void tv(Graphics g) // menu screen
    {
        g.drawImage(tv, 0,0, null);
        
    }
     public void tv1(Graphics g) // menu screen
    {
        g.drawImage(tv1, 0,0, null);
        
    }
      public void com(Graphics g) // menu screen
    {
        g.drawImage(com, 0,0, null);
        
    }
     public void com1(Graphics g) // menu screen
    {
        g.drawImage(com1, 0,0, null);
        
    }
      public void ph(Graphics g) // menu screen
    {
        g.drawImage(ph, 0,0, null);
        
    }
     public void ph1(Graphics g) // menu screen
    {
        g.drawImage(ph1, 0,0, null);
        
    }
    public void vr(Graphics g) // menu screen
{
    g.drawImage(vr, 0, 0, null);
}

public void vr1(Graphics g) // menu screen
{
    g.drawImage(vr1, 0, 0, null);
}

public void gpt(Graphics g) // menu screen
{
    g.drawImage(gpt, 0, 0, null);
}

public void gpt1(Graphics g) // menu screen
{
    g.drawImage(gpt1, 0, 0, null);
}

public void d(Graphics g) // menu screen
{
    g.drawImage(d, 0, 0, null);
}

public void d1(Graphics g) // menu screen
{
    g.drawImage(d1, 0, 0, null);
}

public void d2(Graphics g) // menu screen
{
    g.drawImage(d2, 0, 0, null);
}

public void d3(Graphics g) // menu screen
{
    g.drawImage(d3, 0, 0, null);
}

    public void keyPressed(KeyEvent e)
    {
        
        
        
    }
    public void keyTyped(KeyEvent e)
    {
    }
    public void keyReleased(KeyEvent e)
    {
    }
    
    public void actionPerformed(ActionEvent e)//when timer runs
    {

    }
    public void mousePressed(MouseEvent e)
    {
       /*
        
         // load sounds
        try
        {
            Click = new AudioStream(new FileInputStream("Click2.wav"));
            Switch = new AudioStream(new FileInputStream("Switch2.wav"));
            Drop = new AudioStream(new FileInputStream("Drop2.wav"));
        }
        catch (IOException ea)
        {
        }
        */
        int x = e.getX();
        int y = e.getY(); //get x and y coordinates 
        
       
            if(x>54&&x<216&&y>54&&y<216){
            screen = 3;
             repaint();
           }
           if(x>52&&x<216&&y>270&&y<432)
           {
               screen =5;
                repaint();
            }
               if(x>216&&x<385&&y>162&&y<324)
           
              { screen =7;
                repaint();}
               if(x>351&&x<405&&y>378&&y<486)
           
              { screen =9;
                repaint();}
                 if(x>405&&x<567&&y>216&&y<270)
           
              { screen =11;
                repaint();}
                if(x>513&&x<567&&y>297&&y<405)
           
              { screen =13;
                repaint();}
                 if(x>648&&x<810&&y>162&&y<324)
           
              { screen =15;
                repaint();}
         if(x>864&&x<1026&&y>108&&y<270)
           
              { screen =17;
                repaint();}
         
     }
     public void mouseClicked(MouseEvent e)
    {

    }

    public void mouseReleased(MouseEvent e)
    {

    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseMoved(MouseEvent e) // hover stuff
    {
        int x = e.getX();
        int y = e.getY(); //get x and y coordinates 
        
       
            if(x>54&&x<216&&y>54&&y<216)
            {
                screen = 2;
                repaint();
            }
            else if(x>52&&x<216&&y>270&&y<432)
           
              { screen =4;
                repaint();}
                 else if(x>216&&x<385&&y>162&&y<324)
           
              { screen =6;
                repaint();}
                 else if(x>351&&x<405&&y>378&&y<486)
           
              { screen =8;
                repaint();}
                 else if(x>405&&x<567&&y>216&&y<270)
           
              { screen =10;
                repaint();}
                 else if(x>513&&x<567&&y>297&&y<405)
           
              { screen =12;
                repaint();}
                 else if(x>648&&x<810&&y>162&&y<324)
           
              { screen =14;
                repaint();}
                else if(x>864&&x<1026&&y>108&&y<270)
           
              { screen =16;
                repaint();}
                
             else
            {
                screen =1;
                repaint();
            }
           
        
    }
     


    public void mouseExited(MouseEvent e)
    {

    }

    public void mouseDragged(MouseEvent e)
    {
    }
}