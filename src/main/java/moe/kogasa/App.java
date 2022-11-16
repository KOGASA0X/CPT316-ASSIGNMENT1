package moe.kogasa;
import java.io.*;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */

/**
 * @author kogasa
 * @version 0.1
 */

public class App 
{
    public static void main( String[] args )
    {
        Logic logic=new Logic();
        ArrayList<String> sList=new ArrayList<String>();

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

        // System.out.println("Please select mode (1 bubble 2 selection 3 insertion)");
        // Scanner scan = new Scanner(System.in);
        
        // switch (Integer.valueOf(scan.next())) {
        //     case 1:
        //         System.out.println("Please key in a String");
        //         System.out.println("Mode Bubble "+logic.bubble(scan.next()));
        //         break;
        //     case 2:
        //         System.out.println("Please key in a String");
        //         System.out.println("Mode selection "+logic.selection(scan.next()));
        //         break;
        //     case 3:
        //         System.out.println("Please key in a String");
        //         System.out.println("Mode insertion "+logic.insertion(scan.next()));
        //         break;
        
        //     default:
        //         break;
        // }
        
        try {
            BufferedReader readin=new BufferedReader(new InputStreamReader(App.class.getClassLoader().getResourceAsStream("sgb-words.txt")));
            //StringBuffer sb;
            //System.out.println(readin.ready());
            while (readin.ready()) {
                sList.add(readin.readLine());
                //sb=(new StringBuffer(readin.readLine()));
                
            }
            readin.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        

        //System.out.println(logic.comparestr("ahich", "there"));
        

        try {
            if (args.length==0) {
                throw new ArgsException();
            }
            long start,end;
            switch (args[0]) {
                case "bubble":
                    start=System.nanoTime();
                    sList=logic.bubble(sList);
                    end=System.nanoTime();
                    System.out.println("Algorithm: "+args[0]+" Running time: "+(end-start)+"ns");
                    break;
                case "insertion":
                    start=System.nanoTime();
                    sList=logic.insertion(sList);
                    end=System.nanoTime();
                    System.out.println("Algorithm: "+args[0]+" Running time: "+(end-start)+"ns");
                    break;
                case "selection":
                    start=System.nanoTime();
                    sList=logic.selection(sList);
                    end=System.nanoTime();
                    System.out.println("Algorithm: "+args[0]+" Running time: "+(end-start)+"ns");
                    break;
                case "lsd":
                    start=System.nanoTime();
                    sList=logic.lsd(sList);
                    end=System.nanoTime();
                    System.out.println("Algorithm: "+args[0]+" Running time: "+(end-start)+"ns");
                    break;
            
                default:
                throw new ArgsException();     
            }

            try {
                BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
                for (String string : sList) {
                    writer.write(string+"\n");
                }
                writer.close();
            } catch (IOException e) {
                // TODO: handle exception
                System.out.println(e);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(null);
            //new ArgsException().printStackTrace();
        }
        
        //System.out.println( "Hello World!" );
    }

}

