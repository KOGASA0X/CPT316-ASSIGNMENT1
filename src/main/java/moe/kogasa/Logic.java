package moe.kogasa;
public class Logic {
    
    String bubble(String str)
    {
        StringBuilder temp=new StringBuilder(str);
        boolean flag=true;
        while (flag) {
            flag =false;
            for (int i = 0; i < str.length()-1; i++) {
                if (temp.charAt(i)>(int)temp.charAt(i+1)) {
                    char c= temp.charAt(i);
                    temp.setCharAt(i, temp.charAt(i+1));
                    temp.setCharAt(i+1, c);
                    flag=true;
                }
            }
        }
        
        return temp.toString();
    }


    String selection(String str)
    {
        StringBuilder order=new StringBuilder();
        StringBuilder disoder=new StringBuilder(str);

        while(order.length()!=str.length())
        {
            char temp=disoder.charAt(0);
            int loc=0;
            for (int i = 0; i < disoder.length(); i++) {
                if(disoder.charAt(i)<temp)
                {
                    temp=disoder.charAt(i);
                    loc=i;
                }
            }
            disoder.deleteCharAt(loc);
            order.append(temp);
        }

        return order.toString();
    }

    String insertion(String str)
    {
        StringBuilder s1=new StringBuilder(str);
        for (int i = 1; i < s1.length(); i++)
        {
            boolean flag = true;
            int loc=i;
            while(flag)
            {
                
                if(s1.charAt(loc)<s1.charAt(loc-1))
                {
                    char temp=s1.charAt(loc);
                    s1.setCharAt(loc, s1.charAt(loc-1));
                    s1.setCharAt(loc-1, temp);

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
        return s1.toString();
    }

    boolean comparestr(String s1,String s2)
    {
        boolean flag =false;

        for (int i = 0; i < s1.length(); i++) 
        {
            if (s1.charAt(i)>s2.charAt(i)) {
                flag=true;
                break;
            }    
        }

        return flag;
    }

}
