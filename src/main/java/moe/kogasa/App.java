package moe.kogasa;
import javax.swing.*;
/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        Logic logic=new Logic();
        String str="1589404u659294437689";
        System.out.println(logic.insertion(str));
        //System.out.println( "Hello World!" );
        JFrame frame = new JFrame("CPT316");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        frame.add(panel);
        frame.setVisible(true);
    }

}

