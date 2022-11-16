package moe.kogasa;
import java.util.ArrayList;


public class Logic {
    
    /**
     * @param str Get the string array
     * @return return the order array
     */
    ArrayList<String> bubble(ArrayList<String> str)
    {
        //initialize
        boolean flag=true;

        //will try to loop untill list is order
        while (flag) {
            flag =false;
            for (int i = 0; i < str.size()-1; i++) {

                //if current > next then exchange
                if (str.get(i).compareTo(str.get(i+1))>0) {
                    String c= str.get(i);
                    str.set(i, str.get(i+1));
                    str.set(i+1, c);
                    flag=true;
                }
            }
        }
        
        return str;
    }

    /**
     * @param disorder Get the string array
     * @return return the order array
     */
    ArrayList<String> selection(ArrayList<String> disorder)
    {
        //initialize
        int listsize=disorder.size();
        ArrayList<String> order=new ArrayList<String>();

        //will try to loop untill the elements of "order" is equal disorder
        while(order.size()!=listsize)
        {
            String temp=disorder.get(0);
            int loc=0;

            for (int i = 0; i < disorder.size(); i++) {

                
                if(disorder.get(i).compareTo(temp)<0)
                {
                    temp=disorder.get(i);
                    loc=i;
                }
 
            }
            disorder.remove(loc);
            order.add(temp);
        }

        return order;
    }

    /**
     * @param str Get the string array
     * @return return the order array
     */
    ArrayList<String> insertion(ArrayList<String> str)
    {
        //initialize
        ArrayList<String> s1=new ArrayList<String>(str);
        for (int i = 1; i < s1.size(); i++)
        {
            boolean flag = true;
            int loc=i;
            while(flag)
            {
                
                //if s1[loc-1] > s1[loc] then exchange value
                if(s1.get(loc).compareTo(s1.get(loc-1))<0)
                {
                    String temp=s1.get(loc);
                    s1.set(loc, s1.get(loc-1));
                    s1.set(loc-1, temp);

                    if (loc-1>0) {
                        loc--;
                    }
                    else
                    {
                        break;
                    }
                    
                }
                else
                {
                    flag =false;
                }
                
            }
                

            
        }
        return s1;
    }

    /**
     * @param str Get the string array
     * @return return the order array
     */
    ArrayList<String> lsd(ArrayList<String> str)
    {
        int[] key =new int[256];
        ArrayList<String> temp=new ArrayList<String>(str);

        for (int i = str.get(0).length()-1; i >= 0; i--) {
            //initialize the key
            key=new int[256];

            //cacluate frequency of word
            for (int j = 0; j < str.size(); j++) {
                key[str.get(j).charAt(i)+1]++;
            }

            //convert the frequency to Index
            for (int j = 0; j < key.length-1; j++) {
                //key[j+1]=key[j+1]+key[j];
                key[j+1]+=key[j];
            }

            //sort the word
            for (int j = 0; j < str.size(); j++) {
                temp.set(key[str.get(j).charAt(i)]++, str.get(j));
            }

            //return temp to str
            for (int j = 0; j < str.size(); j++) {
                str.set(j, temp.get(j));
            }
        }




        return str;
    }

    ArrayList<String> msd(ArrayList<String> str)
    {

        
        return str;
    }



/*     boolean comparestr(String s1,String s2)
    {
        boolean flag =false;

        for (int i = 0; i < s1.length(); i++) 
        {
            System.out.println(i);
            if (s1.charAt(i)>s2.charAt(i)) {
                flag=true;
                break;
            }    
            System.out.println(i);
        }

        return flag;
    } */

}
