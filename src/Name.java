/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Honza
 */
public class Name {
    private static final String ADR = "http://svatky.adresa.info/txt?lang=cs&";
    private String name = "";

    public Name(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getNameAdress () {
        String nameAdress = ADR + "name=" + this.name;
    return nameAdress;                 
}

}
