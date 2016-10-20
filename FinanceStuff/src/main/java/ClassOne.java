import yahoofinance.YahooFinance;
import java.io.*;
/**
 * Created by Vesa on 10/20/2016.
 */
public final class ClassOne {

    public static String getInfos(final String name){

        try {
           return  YahooFinance.get(name);

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }


}
