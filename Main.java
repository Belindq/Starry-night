import javax.swing.JFrame;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setBounds(0, 0, 1080, 810);
        frame.setTitle("StarsAlign ");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        art game = new art();
        frame.add(game);
        
        frame.setVisible(true);
    }
}
       
   