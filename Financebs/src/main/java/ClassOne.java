import yahoofinance.YahooFinance;
import java.io.IOException;
/**
 * Created by Vesa on 10/21/2016.
 */
public final class ClassOne {

    public static String getInfos(final String name){

        try{

            return "Emri:"+ YahooFinance.get(name).getName() + "\n" +
                    "Stock Exchange:"+ YahooFinance.get(name).getStockExchange() + "\n" +
                    "Kuota:"+ YahooFinance.get(name).getQuote() + "\n" +
                    "Currency:"+ YahooFinance.get(name).getCurrency() + "\n" +
                    "Historia:"+ YahooFinance.get(name).getHistory() + "\n" ;
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        return "ERROR: No connection" ;
    }
}
