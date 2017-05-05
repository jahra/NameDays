/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Honza
 */
public class UrlProvider {
    public UrlProvider () {
       
    }
    public String readUrl(String url){
        try {
            URL apiUrl = new URL(url); //new obj s url
            URLConnection connection = apiUrl.openConnection();//otevira pripojeni
//            System.out.println(connection.getContentType());
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));//nacita data ze streamu(connection)
            StringBuilder strbr = new StringBuilder(); //vytvari retezce
            String line = "";
            while ((line = br.readLine())!= null){
                strbr.append(line);                               
            }
            br.close();
            return strbr.toString(); // pretypuje z stringbuilderu na string a vrati
                
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(UrlProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UrlProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
