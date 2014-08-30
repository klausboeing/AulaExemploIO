/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testeio;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Klaus Boeing
 */
public class TesteProperties2 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileReader("C:\\meusprogramas\\teste.ini"));
        System.out.println(p.getProperty("host"));
        System.out.println(p.getProperty("porta"));
        p.setProperty("key", "123234");
        p.setProperty("key", "123234");
        p.put("key", "13123");
        p.store(new FileOutputStream("C:\\meusprogramas\\teste2.ini"), "Teste");
        p.storeToXML(new FileOutputStream("C:\\meusprogramas\\teste.xml"), "Teste");
    }
}
