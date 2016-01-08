

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.concurrent.Task;

/**
 * Created by Wojtek on 2016-01-06.
 */
public class StringTesting {
    int x = 5;
    int y = 6;
    //dkdkfkdfkjjdjfocbdd

    public class NielegalnaPozycja extends Exception{
    }
    public void moveTo(int x, int y) throws Exception {
        if(x>y){
            throw new Exception();
        }
        this.x = x;
        this.y = y;
    }
    public class Test extends Task {

        private String nazwa;
        public void setNazwa(String nazwa){
            this.nazwa = nazwa;
        }



        @Override
        protected Object call() throws Exception {
            System.out.println("dostałem nazwe: "+nazwa);
            return null;
        }
    }


    public static void main(String args [ ]){



        try {
            StringTesting a = new StringTesting();

            String kupa = "kupa.do";
            String dupa = "dupa.do";


            int j=0;
            String[] zupa = {"grochowa","pomidorowa","burakowa"};
            System.out.println(kupa.charAt(2));
            System.out.println(kupa.concat(dupa));
            System.out.println(kupa.equals(dupa));
            System.out.println(kupa.equalsIgnoreCase(dupa));
            System.out.println(kupa.length());
            System.out.println(kupa.replace("k", "d"));
            System.out.println(kupa.substring(1));
            System.out.println(kupa.substring(0, 2));
            System.out.println(kupa.toUpperCase());
            System.out.println(kupa.trim());
            System.out.println(Arrays.toString(dupa.split("[*.]")));
            StringBuilder sb = new StringBuilder();
            while (j<10000){
                sb.append("*");
                j++;
            }
            System.out.println(sb.toString());
            sb.delete(0, 9996);
            System.out.println(sb);
            sb.insert(2, "kupa");
            System.out.println(sb);
            a.moveTo(3,5);
            a.moveTo(5,3);
        } catch (Exception e) {
            Logger.getAnonymousLogger().log(Level.SEVERE, e.getMessage());
//            System.out.println(e);
        }


    }


}
