/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razor;

import razor.login.RazorLogin;

/**
 *
 * @author scast
 */
public class Razor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RazorLogin login = new RazorLogin ();
        login.setVisible(true);
    }
    
}
