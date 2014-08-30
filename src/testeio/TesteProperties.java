/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testeio;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Klaus Boeing
 */
public class TesteProperties {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("c:\\meusprogramas\\teste.ini"));
        
        System.out.println(p.getProperty("host"));
        System.out.println(p.getProperty("port"));
        
        p.setProperty("port", "443");
        p.setProperty("key", "123123123");
        
        System.out.println(p.getProperty("key"));
        System.out.println(p.getProperty("port"));
        
        FileWriter fileWriter = new FileWriter("c:\\meusprogramas\\teste2.ini");
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\meusprogramas\\teste2.xml");

        p.store(fileWriter, "Arquivo de configurações para acesso a internet");
        p.storeToXML(fileOutputStream, "Arquivo de configurações para acesso a internet");
        
        fileWriter.close();
        fileOutputStream.close();
        
    }
}
