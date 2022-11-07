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
        //System.out.println( "Hello World!" );
        JFrame frame = new JFrame("CPT316");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        frame.add(panel);
        frame.setVisible(true);
    }

    String bubble(String str)
    {
        StringBuilder temp=new StringBuilder(str);
        for (int i = 0; i < str.length()-1; i++) {
            if (temp.charAt(i)>(int)temp.charAt(i+1)) {
                char c= temp.charAt(i);
                temp.setCharAt(i, temp.charAt(i+1));
                temp.setCharAt(i+1, c);
            }
        }
        return temp.toString();
    }
    String selection(String str)
    {

        return null;
    }
    String insertion(String str)
    {
        return null;
    }

}

