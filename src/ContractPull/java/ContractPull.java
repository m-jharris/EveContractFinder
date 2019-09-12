import com.google.gson.*;
import com.google.gson.stream.JsonReader;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



public class ContractPull {

    private String jsonSource;
    private boolean sourceFromFile;
    private String urlSource;
    private String inline = "";
    private List contractHolder;

    ContractPull(String jsonSource, boolean sourceFromFile){
        this.jsonSource = jsonSource;
        this.sourceFromFile = sourceFromFile;
    }

    ContractPull(String urlSource){
        this.urlSource = urlSource;

    }


    private JsonReader getJsonUrlReader () throws IOException {
        JsonReader reader;
        URL url = new URL(this.urlSource);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        reader = new JsonReader(
                    new InputStreamReader((InputStream)conn.getContent()));

        return reader;
    }

    public List pullItemExchangeContractsUrl(){
        try(JsonReader jsonReader = this.getJsonUrlReader()){
            Gson gsonParser = new Gson();
            JsonParser jsonParser = new JsonParser();
            JsonArray jArray =  jsonParser.parse(jsonReader).getAsJsonArray();
            contractHolder = new ArrayList<Contract>();
            for ( JsonElement aUser : jArray ){
                Contract aContract = gsonParser.fromJson(aUser, Contract.class);
                if(aContract.getType().contentEquals("item_exchange")){
                    contractHolder.add(aContract);
                }
            }
            //just for printing purposes
            contractHolder.forEach((temp)->{
                System.out.println(temp);
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractHolder;

    }
//todo: need to increment page number for url
}
