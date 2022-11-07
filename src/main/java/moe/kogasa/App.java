package moe.kogasa;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        Logic logic=new Logic();
        //String str="1589404u659294437689";
        //System.out.println(logic.insertion(str));
        //System.out.println( "Hello World!" );

        /* JFrame frame = new JFrame("CPT316");
        
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel panel=new JPanel();

        JTextField userText = new JTextField(20);
        frame.setLocationRelativeTo(panel);
        panel.add(userText);
        
        JTextField userText2 = new JTextField(20);
        frame.setLocationRelativeTo(panel);
        panel.add(userText2);

        JButton ModeButton = new JButton("login");
        panel.add(ModeButton);

        userText.getText();
        JLabel label = new JLabel("Hello World");
        label.setText("2333");
        panel.add(label);


        
        frame.add(panel);
        frame.setVisible(true); */

        System.out.println("Please select mode (1 bubble 2 selection 3 insertion)");
        Scanner scan = new Scanner(System.in);
        
        switch (Integer.valueOf(scan.next())) {
            case 1:
                System.out.println("Please key in a String");
                System.out.println("Mode Bubble "+logic.bubble(scan.next()));
                break;
            case 2:
                System.out.println("Please key in a String");
                System.out.println("Mode selection "+logic.selection(scan.next()));
                break;
            case 3:
                System.out.println("Please key in a String");
                System.out.println("Mode insertion "+logic.insertion(scan.next()));
                break;
        
            default:
                break;
        }
    }

}

