/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HONZA
 */
public class NamedayGcontacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Name name = new Name("Tomáš");
        String url = name.getNameAdress();
        
        UrlProvider p = new UrlProvider();
        System.out.println(p.readUrl(url));
    }
    
}
