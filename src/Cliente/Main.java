/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;

/**
 *
 * @author Cliente
 */
public class Main {
    public static void main(String []args) throws IOException{
               
        Cliente app = new Cliente();
        app.conectar();
        app.escutar();
    }
    
}
