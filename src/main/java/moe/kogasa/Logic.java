package moe.kogasa;

import java.util.ArrayList;

public class Logic {
    
    ArrayList<String> bubble(ArrayList<String> str)
    {
        int j=0;
        boolean flag=true;
        while (flag) {
            flag =false;
            for (int i = 0; i < str.size()-1; i++) {
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


    ArrayList<String> selection(ArrayList<String> disorder)
    {
        int listsize=disorder.size();
        ArrayList<String> order=new ArrayList<String>();

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

    ArrayList<String> insertion(ArrayList<String> str)
    {
        ArrayList<String> s1=new ArrayList<String>(str);
        for (int i = 1; i < s1.size(); i++)
        {
            boolean flag = true;
            int loc=i;
            while(flag)
            {
                
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
