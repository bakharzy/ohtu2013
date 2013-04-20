package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        String studentNr = "14083589";
        if ( args.length>0) {
            studentNr = args[0];
        }
 
        String url = "http://ohtustats-2013.herokuapp.com/opiskelija/"+studentNr+".json";
 
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);
 
        InputStream stream =  method.getResponseBodyAsStream();
 
        String bodyText = IOUtils.toString(stream);
 
//        System.out.println("json-muotoinen data:");
//        System.out.println( bodyText );
 
        Gson mapper = new Gson();
        Palautukset palautukset = mapper.fromJson(bodyText, Palautukset.class);
 
        System.out.println("Student Number: "+ studentNr+ "\n");
        int cntr=1;
        int totalHours = 0,totalExercises=0;
        for (Palautus palautus : palautukset.getPalautukset()) {
            System.out.print("Week "+cntr+ ": ");
            System.out.println( palautus );
            totalExercises+=palautus.getTehtavia();
            totalHours+=palautus.getTunteja();
            cntr++;
        }
        System.out.println("\n"+"Total Exercises " + totalExercises + " exercises and " +totalHours + " hours spent");
    }
}